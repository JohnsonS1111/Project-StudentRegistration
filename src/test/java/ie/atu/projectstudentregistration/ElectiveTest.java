package ie.atu.projectstudentregistration;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElectiveTest {
    private final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = validatorFactory.getValidator();

    @Test
    public void testValidElective(){
        Elective elective = new Elective();

        elective.setElective1("Spanish");
        elective.setElective2("Soccer");
        assertTrue(validator.validate(elective).isEmpty());
    }

    @Test
    public void testInvalidElective(){
        Elective elective = new Elective();

        elective.setElective1("");
        elective.setElective2("Applied Maths");
        assertEquals(1, validator.validate(elective).size());
    }
}
