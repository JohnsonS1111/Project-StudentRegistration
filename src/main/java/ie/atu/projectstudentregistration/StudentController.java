package ie.atu.projectstudentregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService, EmailService emailService){
        this.studentService = studentService;
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

    @GetMapping("/registerStudent/{firstname}/{email}")
    public String confirmStudent(@PathVariable String firstname, @PathVariable String email){
        return studentService.registerStudent(firstname, email);
    }
}