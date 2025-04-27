package com.weatherapp;

import com.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class WeatherAppApplication implements CommandLineRunner {

	@Autowired
	private WeatherService weatherService;

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir şehir ismi giriniz: ");
		String cityName = scanner.nextLine();

		String weatherData = weatherService.getWeatherData(cityName);
		System.out.println(weatherData);
	}
}
