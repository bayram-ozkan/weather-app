package com.weatherapp;

import com.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherAppApplication implements CommandLineRunner {

	@Autowired
	private WeatherService weatherService;

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String cityName = "Istanbul"; // Burada hangi şehrin hava durumunu görmek istersen yaz
		String weatherData = weatherService.getWeatherData(cityName);
		System.out.println(weatherData);
	}
}
