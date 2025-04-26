package com.weatherapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getWeatherData(String cityName) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = apiUrl + "?q=" + cityName + "&appid=" + apiKey + "&units=metric";
            String jsonResponse = restTemplate.getForObject(url, String.class);

            // JSON verisini parse et
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode root = objectMapper.readTree(jsonResponse);

            String city = root.path("name").asText();
            double temp = root.path("main").path("temp").asDouble();
            String weatherDescription = root.path("weather").get(0).path("description").asText();
            int humidity = root.path("main").path("humidity").asInt();
            double windSpeed = root.path("wind").path("speed").asDouble();

            return "City: " + city +
                    "\nTemperature: " + temp + "°C" +
                    "\nWeather: " + weatherDescription +
                    "\nHumidity: " + humidity + "%" +
                    "\nWind Speed: " + windSpeed + " m/s";
        } catch (Exception e) {
            return "Error retrieving weather data: " + e.getMessage();
        }
    }
}
