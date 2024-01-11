package ie.atu.projectstudentregistration;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/studentDetails")
    public @ResponseBody List<StudentClass> getStudent(){
        return studentService.getStudentDetails();
    }

    @PostMapping("/createStudent")
    public String createStudent(@Valid @RequestBody StudentClass sc){
        studentService.createStudent(sc);
        return "Student added";
    }

    @PostMapping("/confirm-student")
    public String confirmStudent(@RequestBody StudentClass studentClass){
        String confirm = courseServiceClient.studentDetails(studentClass);
        return confirm + " " + acknowledgeService.ackMessage(studentClass);

    }
}