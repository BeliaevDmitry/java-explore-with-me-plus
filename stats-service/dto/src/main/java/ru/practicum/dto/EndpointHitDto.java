package ru.practicum.dto;

import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndpointHitDto {

    Long id;
    String app;
    String uri;
    String ip;
    String timestamp;

}