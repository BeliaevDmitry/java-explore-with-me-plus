package dto_model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

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