package Utilities;

public class Validator {

    OutputHandler output = new OutputHandler();

    public boolean isNumValid(String input) {

        if(input.isEmpty() || input.matches("0")) {
            output.nullString();
            return false;
        } else if(input.matches("[a-zA-Z]+")) {
            output.wordString();
            return false;
        } else if(input.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    public boolean isStringValid(String input) {

        if(input.isEmpty()) {
            output.defaultSetting();
            return true;
        } else if(input.matches("[a-zA-Z]+")) {
            return true;
        } else if(input.matches("[0-9]+")) {
            return true;
        }
        return false;
    }
}
