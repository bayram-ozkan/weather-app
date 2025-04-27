# Weather App 🌦️

Simple Weather Application built with Java Spring Boot that fetches real-time weather data from OpenWeatherMap API.

## Features
- Fetches real-time weather data by city name
- Displays temperature, weather description, humidity, and more
- Built with Java 21 and Spring Boot 3.4.5
- Easy to extend with frontend (React / Next.js integration planned)

## Technologies Used
- Java 21
- Spring Boot 3.4.5
- Maven
- OpenWeatherMap API

## How to Run
1. Clone the repository:
    ```bash
    git clone https://github.com/semasahinbay/weather-app.git
    ```

2. Navigate to the project directory:
    ```bash
    cd weather-app
    ```

3. Update your `src/main/resources/application.properties` file with your OpenWeatherMap API key.

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

5. Use the Application:
    - You can **enter the city name** when prompted in the console.
    - Or you can **send a request from your browser** like:
      ```
      http://localhost:8080/weather?city=Istanbul
      ```

## API Source
- [OpenWeatherMap API](https://openweathermap.org/api)
