/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {

    public static void main(String[] args) {
        WeatherForecastApiClient client = new WeatherForecastApiClient();
        String forecast = client.getWeatherForecast();
        System.out.println(forecast);
    }
}
