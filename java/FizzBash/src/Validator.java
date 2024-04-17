public class Validator {

    public void nullString() {
        System.out.println("ERROR: This input cannot be empty");
    }

    public void wordString() {
        System.out.println("ERROR: This input cannot use words or letters");
    }


    public boolean isNumValid(String input) {

        if(input.isEmpty() || input.matches("0")) {
            nullString();
            return false;
        } else if(input.matches("[a-zA-Z]+")) {
            wordString();
            return false;
        } else if(input.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    public boolean isStringValid(String input) {

        if(input.isEmpty()) {
            System.out.println("Setting to Default - DEPRICIATED");
            return false;
        } else if(input.matches("[a-zA-Z]+")) {
            return true;
        } else if(input.matches("[0-9]+")) {
            return true;
        }
        return false;
    }
}
