package cl.teamweichafe.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Builder
@Document("member_measures")
public class MemberMeasure {

    @Id
    private String id;
    private Member member;
    private Measure measure;
    private float value;
    @CreatedDate
    private LocalDate measureDate;
}
