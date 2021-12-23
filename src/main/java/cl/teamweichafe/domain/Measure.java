package cl.teamweichafe.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
public class Measure {

    private String id;
    private String unit;
    private String measureDesc;
}
