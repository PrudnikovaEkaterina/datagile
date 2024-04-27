package ru.datagile.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Clouds(
        Integer all) {
    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}
