package ru.datagile.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Main(
        Double temp,
        @JsonProperty("feels_like")
        Double feelsLike,
        @JsonProperty("temp_min")
        Double tempMin,
        @JsonProperty("temp_max")
        Double temp_max,
        Integer pressure,
        Integer humidity
) {
}
