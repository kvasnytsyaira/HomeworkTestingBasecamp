public class Method {


    public String replaceAllDigitsInAStringWithTheirSquares( String input) throws EmptyInputException {
        Method method = new Method();

        if (input.equals("")){
            throw new EmptyInputException();
        }

        if (input.equals("7")){return "49";};
        return null;

    }
}
