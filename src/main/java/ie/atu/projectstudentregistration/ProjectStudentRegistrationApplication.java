package ie.atu.projectstudentregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectStudentRegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectStudentRegistrationApplication.class, args);
    }

}
