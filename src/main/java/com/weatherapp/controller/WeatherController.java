package com.weatherapp.controller;

import com.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getWeather(@RequestParam String city) {
        return weatherService.getWeatherData(city);
    }
}
