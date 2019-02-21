import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestReplaceAllDigits {

    @Test
    public void test_replaceAllDigits_when_input_is_null_expected_exception(){
        Method method = new Method();
        Assertions.assertThrows(EmptyInputException.class, () ->
            method.replaceAllDigitsInAStringWithTheirSquares("") );
    }

    @Test
    public void test_replaceAllDigits_when_input_is_oneGap_expected_exception(){
        Method method = new Method();
        Assertions.assertThrows(EmptyInputException.class, () ->
                method.replaceAllDigitsInAStringWithTheirSquares(" ") );
    }

    @Test
    public void test_replaceAllDigits_when_input_equals_7_expected_result_is_49 () throws EmptyInputException {
        Method method = new Method();
        assertEquals("49",method.replaceAllDigitsInAStringWithTheirSquares("7"));
    }

    @Test
    public void test_replaceAllDigits_when_input_equals_SEVEN_expected_result_is_FORTY_NINE () throws EmptyInputException{
        Method method = new Method();
        assertEquals("FORTY NINE",method.replaceAllDigitsInAStringWithTheirSquares("SEVEN"));
    }

    @Test
    public void test_replaceAllDigits_when_input_doesNot_contain_digits_expected_result_output_equals_input () throws EmptyInputException{
        Method method = new Method();
        assertEquals("This is a million - 1000000",method.replaceAllDigitsInAStringWithTheirSquares("This is a million - 1000000"));
    }

}
