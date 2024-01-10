package ie.atu.projectstudentregistration;

import ie.atu.projectstudentregistration.StudentClass;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class AcknowledgeService {
    public String ackMessage(StudentClass student){
        return " Thank you" + student.getFirstname() + " " + student.getSurname() +
                " at email" + student.getEmail()+ ", your request has been received.";
    }
}