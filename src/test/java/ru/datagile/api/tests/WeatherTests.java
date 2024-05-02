package ru.datagile.api.tests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.datagile.api.models.Root;

import java.util.Date;

import static io.restassured.RestAssured.given;

public class WeatherTests {
    @Test
    @DisplayName("Get and print weather")
    void getWeather() {
        Root root = given()
                .baseUri("https://api.openweathermap.org/data/2.5/weather")
                .contentType(ContentType.JSON)
                .param("lat", "59.9342802")
                .param("lon", "30.3350986")
                .param("appid", "1275e7355b520b4844068e949913ab7a")
                .log().all()
                .get()
                .then()
                .log().body()
                .statusCode(200)
                .extract().as(Root.class);

        System.out.println(root.clouds());
        root.weather().forEach(System.out::println);
        System.out.println(root.main());
        System.out.println(root.wind());
        Date current = new Date();
        System.out.println("Current date and time: "+current);
    }
}
