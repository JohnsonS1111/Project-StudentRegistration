package ie.atu.projectstudentregistration;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentClass {
    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("birthdate")
    private int age;

    @JsonProperty("email")
    private String email;

}
