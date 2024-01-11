package ie.atu.projectstudentregistration;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentClassTest {
    private final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = validatorFactory.getValidator();

    @Test
    public void testValidStudent(){
        StudentClass student = new StudentClass();
        student.setFirstname("Johnson");
        student.setSurname("Shogbaike");
        student.setAge(20);
        student.setEmail("johnson@gmail.com");
        assertTrue(validator.validate(student).isEmpty());
    }

    @Test
    public void testInvalidStudent(){
        StudentClass student = new StudentClass();
        student.setFirstname("Johnson");
        student.setSurname("Shogbaike");
        student.setAge(10);
        student.setEmail("johnson@gmail.com");
        assertEquals(1, validator.validate(student).size());
    }
}
