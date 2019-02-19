
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestReplaceAllDigits {

    @Test
    public void test_replaceAllDigits_when_input_is_null_expected_exception(){
        Method method = new Method();
        Assertions.assertThrows(EmptyInputException.class, () -> {
            method.replaceAllDigitsInAStringWithTheirSquares("");
        });
    }

    @Test
    public void test_replaceAllDigits_when_input_equals_7_expected_result_is_49 () throws Throwable {
        Method method = new Method();
        assertEquals("49",method.replaceAllDigitsInAStringWithTheirSquares("7"));
    }
}
