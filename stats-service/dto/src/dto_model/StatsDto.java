package dto_model;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatsDto {

    String app;
    String uri;
    Long hits;
}