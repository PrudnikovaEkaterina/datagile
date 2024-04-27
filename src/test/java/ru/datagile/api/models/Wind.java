package ru.datagile.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Wind(
        Integer speed,
        Integer deg
) {
    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}
