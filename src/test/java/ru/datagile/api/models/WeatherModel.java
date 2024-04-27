package ru.datagile.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherModel(
        Integer id,
        String main,
        String description,
        String icon
) {
    @Override
    public String toString() {
        return "WeatherModel{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'';
    }
}
