// // local de çalışması için burası açınız
// package com.weatherapp;
// import com.weatherapp.service.WeatherService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import java.util.Scanner;

// @SpringBootApplication
// public class WeatherAppApplication implements CommandLineRunner {

// 	@Autowired
// 	private WeatherService weatherService;

// 	public static void main(String[] args) {
// 		SpringApplication.run(WeatherAppApplication.class, args);
// 	}

// 	@Override
// 	public void run(String... args) {
// 		if (args.length == 0) {
// 			Eğer tarayıcı üzerinden bir şehir parametresi gelmemişse konsoldan iste
// 			Scanner scanner = new Scanner(System.in);
// 			System.out.print("Bir şehir ismi giriniz: ");
// 			String cityName = scanner.nextLine();

// 			String weatherData = weatherService.getWeatherData(cityName);
// 			System.out.println(weatherData);
// 		}
// 	}

// }

// ////////////////////////////////////////////////////////////////////////////////////////////////


@SpringBootApplication
public class WeatherAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherAppApplication.class, args);
    }

    // Bu bölümü yoruma alın ya da silin
    /*
    @Bean
    public CommandLineRunner run(WeatherService service) {
        return args -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir şehir ismi giriniz: ");
            String city = scanner.nextLine();
            Weather weather = service.getWeather(city);
            System.out.println(weather);
        };
    }
    */
}

