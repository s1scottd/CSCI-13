package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherForecastApiClient {

  public String getWeatherForecast() {
    String apiUri = "https://api.weather.gov/gridpoints//STO/53,76/forecast";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(apiUri))
        .GET()
        .build();

    try {
      // Send the request and receive the response
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      if (response.statusCode() == 200) {
        return response.body();
      } else {
        return "Failed to get weather forecast. HTTP status code: " + response.statusCode();
      }
    } catch (Exception e) {
      return "Failed to get weather forecast. Exception: " + e.getMessage();
    }
  }
}