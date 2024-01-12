package ie.atu.projectstudentregistration;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("firstname")
    @NotBlank(message = "firstname cannot be blank")
    private String firstname;

    @JsonProperty("surname")
    @NotBlank(message = "surname cannot be blank")
    private String surname;

    @JsonProperty("age")
    @Min(value = 17, message = "user must be 17 or older to register")
    private int age;

    @JsonProperty("email")
    @Email(message = "invalid email address")
    @NotBlank(message = "email cannot be blank")
    private String email;

}
