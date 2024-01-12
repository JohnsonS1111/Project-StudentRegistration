package ie.atu.projectstudentregistration;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseTest {
    private final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = validatorFactory.getValidator();

    @Test
    public void testValidCourse(){
        Course course = new Course();

        course.setCourseCode("23D5I");
        course.setCourseName("Electronic and Software engineering");
        assertTrue(validator.validate(course).isEmpty());
    }

    @Test
    public void testInvalidCourse(){
        Course course = new Course();

        course.setCourseName("");
        course.setCourseCode("2DF4");
        assertEquals(2, validator.validate(course).size());
    }
}
