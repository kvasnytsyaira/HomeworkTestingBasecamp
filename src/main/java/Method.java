import java.util.HashMap;

public class Method {


    public String replaceAllDigitsInAStringWithTheirSquares(String input) throws EmptyInputException {

        if (input.equals("")){throw new EmptyInputException();}

        HashMap<String , String> digits = new HashMap<>();
        digits.put("ONE", "ONE");
        digits.put("TWO", "FOUR");
        digits.put("THREE", "NINE");
        digits.put("FOUR", "SIXTEEN");
        digits.put("FIVE", "TWENTY FIVE");
        digits.put("SIX", "THIRTY SIX");
        digits.put("SEVEN", "FORTY NINE");
        digits.put("EIGHT", "SIXTY FOUR");
        digits.put("NINE", "EIGHTY ONE");
        digits.put(" 1 ", " 1 ");
        digits.put(" 2 ", " 4 ");
        digits.put(" 3 ", " 9 ");
        digits.put(" 4 ", " 16 ");
        digits.put(" 5 ", " 25 ");
        digits.put(" 6 ", " 36 ");
        digits.put(" 7 ", " 49 ");
        digits.put(" 8 ", " 64 ");
        digits.put(" 9 ", " 81 ");

        for ( String key : digits.keySet() ) {
            if (input.contains(key)) {
                input = input.replaceAll(key, digits.get(key));}
        }
        String output= input;
        return output;
    }
}
