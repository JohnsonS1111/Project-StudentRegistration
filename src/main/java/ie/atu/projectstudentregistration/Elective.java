package ie.atu.projectstudentregistration;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Elective {
    @NotBlank(message = "Choice module one must be chosen")
    @JsonProperty("FirstChoice")
    private String elective1;

    @NotBlank(message = "Choice module two must be chosen")
    @JsonProperty("SecondChoice")
    private String elective2;

}
