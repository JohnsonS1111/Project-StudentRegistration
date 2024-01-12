package ie.atu.projectstudentregistration;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;
    private AcknowledgeService acknowledgeService;
    private CourseServiceClient courseServiceClient;

    @Autowired
    public void setStudentService(StudentService studentService, EmailService emailService,
                                  CourseServiceClient courseServiceClient, AcknowledgeService acknowledgeService){

        this.studentService = studentService;
        this.courseServiceClient = courseServiceClient;
        this.acknowledgeService = acknowledgeService;

    }

    @GetMapping("/studentDetails/{email}")
    public ResponseEntity<?> getStudent(@PathVariable String email){
        if(email.isBlank()){
            return ResponseEntity.badRequest().body("Email is invalid");
        }

        StudentClass student = studentService.getStudentDetails(email);
        if(student == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(student);
    }

    @GetMapping("/allStudents")
    public ResponseEntity<?> getAllStudent(){

        List<StudentClass> student = studentService.getAllStudents();
        if(student == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(student);
    }
    @PostMapping("/createStudent")
    public String createStudent(@Valid @RequestBody StudentClass sc, BindingResult bindingResult){

        studentService.createStudent(sc);
        return "Student added";
    }
}