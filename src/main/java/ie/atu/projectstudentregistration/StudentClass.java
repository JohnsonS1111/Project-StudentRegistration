package ie.atu.projectstudentregistration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentClass {
    private String firstname;
    private String surname;
    private LocalDate birthdate;
    private String email;
    private String gender;
}
