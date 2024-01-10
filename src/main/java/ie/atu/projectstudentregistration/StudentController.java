package ie.atu.projectstudentregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    private StudentService studentService;
    private AcknowledgeService acknowledgeService;
    private PaymentServiceClient paymentServiceClient;

    @Autowired
    public void setStudentService(StudentService studentService, EmailService emailService,
                                  PaymentServiceClient paymentServiceClient, AcknowledgeService acknowledgeService){

        this.studentService = studentService;
        this.paymentServiceClient = paymentServiceClient;
        this.acknowledgeService = acknowledgeService;

    }

    @GetMapping("/studentDetails")
    public @ResponseBody List<StudentClass> getStudent(){
        return studentService.getStudentDetails();
    }

    @PostMapping("/createStudent")
    public String createStudent(@RequestBody StudentClass sc){
        studentService.createStudent(sc);
        return "Student added";
    }

    @PostMapping("/confirm-student")
    public String confirmStudent(@RequestBody StudentClass studentClass){
        String confirm = paymentServiceClient.studentDetails(studentClass);
        return confirm + " " + acknowledgeService.ackMessage(studentClass);

    }
}