package ie.atu.projectstudentregistration;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-service", url = "http://localhost:8082")
public interface PaymentServiceClient {
    @PostMapping("/payment")
    String studentDetails(@RequestBody StudentClass studentClass);
}
