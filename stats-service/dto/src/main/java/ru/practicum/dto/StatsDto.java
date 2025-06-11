package ru.practicum.dto;

import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatsDto {

    String app;
    String uri;
    Long hits;

}