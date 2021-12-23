package cl.teamweichafe.domain;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDate;

@Getter
@Builder
public class Member {

    private String id;
    private String name;
    private String lastName;
    private LocalDate dob;
    private Integer phone;
    private String email;
    private String address;
}
