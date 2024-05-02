package ru.datagile.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherModel(
        Integer id,
        String main,
        String description,
        String icon
) {
}
