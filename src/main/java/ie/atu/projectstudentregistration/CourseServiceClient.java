package ie.atu.projectstudentregistration;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "course-service", url = "$course-service")
public interface CourseServiceClient {
    @PostMapping("/payment")
    String studentDetails(@RequestBody StudentClass studentClass);
}
