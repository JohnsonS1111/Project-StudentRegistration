package ie.atu.projectstudentregistration;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @JsonProperty("CourseName")
    @NotBlank(message = "course name cannot be blank")
    private String CourseName;

    @JsonProperty("CourseCode")
    @NotBlank(message = "please enter a valid course code")
    @Size(min = 5, max = 5, message = "code must be 5 characters long")
    private String CourseCode;
}
