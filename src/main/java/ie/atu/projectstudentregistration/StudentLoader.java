package ie.atu.projectstudentregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentLoader implements CommandLineRunner {
    private final StudentClassRepo studentClassRepo;

    @Autowired
    public StudentLoader(StudentClassRepo studentClassRepo){
        this.studentClassRepo = studentClassRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        StudentClass nullData = new StudentClass(1l, "null", "null", 17, "null@noone.ie");
        StudentClass testData1 = new StudentClass(3L, "Johnson", "Shogbaike", 20, "js@gmail.com");
        StudentClass testData2 = new StudentClass(13L, "Mike", "Piston", 18, "mp@gmail.com");
        StudentClass testData3 = new StudentClass(1L, "Jay", "Won", 26, "jw@gmail.com");

        studentClassRepo.save(nullData);
        studentClassRepo.save(testData1);
        studentClassRepo.save(testData2);
        studentClassRepo.save(testData3);
    }
}
