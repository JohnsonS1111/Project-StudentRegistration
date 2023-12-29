package ie.atu.projectstudentregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final EmailService emailService;
    private final List<StudentClass> students = new ArrayList<>();

    public void createStudent(StudentClass sc){
        students.add(sc);
    }

    public List<StudentClass> getStudentDetails(){
        return students;
    }
    @Autowired
    public StudentService(EmailService emailService){
        this.emailService = emailService;
    }

    public String registerStudent(String firstname, String email){
        emailService.sendEmail(email, "You have now registered with Atlantic Technical University with the email. Welcome to ATU " +firstname);
        return "Name: " + firstname + " Email: " + email;
    }
}
