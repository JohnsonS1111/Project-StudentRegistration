//package ie.atu.projectstudentregistration;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class StudentControllerIntegrationTest {
//
//    @Autowired
//    private final MockMvc mockMvc;
//
//    @Autowired
//    private final ObjectMapper objectMapper;
//
//    @Autowired
//    public StudentControllerIntegrationTest(MockMvc mockMvc, ObjectMapper objectMapper){
//        this.mockMvc = mockMvc;
//        this.objectMapper = objectMapper;
//    }
//
//    @Test
//    public void testValidStudentController() throws Exception {
//        StudentClass validStudent = new StudentClass();
//        validStudent.setFirstname("Jacob");
//        validStudent.setSurname("Matthews");
//        validStudent.setAge(19);
//        validStudent.setEmail("jm@atu.ie");
//
//        String requestBody = objectMapper.writeValueAsString(validStudent);
//        MvcResult result = this.mockMvc.perform(
//                        post("/createStudent")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(requestBody))
//                .andExpect(status().isOk())
//                .andReturn();
//    }
//
//    @Test
//    public void testInvalidStudentController() throws Exception{
//        StudentClass validStudent = new StudentClass();
//        validStudent.setFirstname("");
//        validStudent.setSurname("Matthews");
//        validStudent.setAge(13);
//        validStudent.setEmail("jm@atu.ie");
//
//        String requestBody = objectMapper.writeValueAsString(validStudent);
//        MvcResult result = this.mockMvc.perform(
//                            post("/createStudent")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(requestBody))
//                .andExpect(status().isOk())
//                .andReturn();
//    }
//
//
//
//}
