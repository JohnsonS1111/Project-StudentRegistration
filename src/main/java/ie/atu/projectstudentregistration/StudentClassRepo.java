package ie.atu.projectstudentregistration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentClassRepo extends JpaRepository<StudentClass, Long> {

    StudentClass findByEmail(String email);
}
