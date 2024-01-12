package ie.atu.projectstudentregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final EmailService emailService;
    private final StudentClassRepo studentClassRepo;

    public void createStudent(StudentClass sc){
        studentClassRepo.save(sc);
    }

    public StudentClass getStudentDetails(String email){
        return studentClassRepo.findByEmail(email);
    }
    @Autowired
    public StudentService(EmailService emailService, StudentClassRepo studentClassRepo){
        this.emailService = emailService;
        this.studentClassRepo = studentClassRepo;
    }

    public String registerStudent(String firstname, String email){
        emailService.sendEmail(email, "You have now registered with Atlantic Technical University with the email. Welcome to ATU " +firstname);
        return "Name: " + firstname + " Email: " + email;
    }

    public List<StudentClass> getAllStudents() {
        return studentClassRepo.findAll();
    }
}
