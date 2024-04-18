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

    public boolean isStart(String input) {
        if(input.isEmpty()) {
            System.out.println("Enter 'start' to enter the game or Enter 'exit' to close the game.");
            return false;
        } else if(input.matches("start")) {
            return true;
        }
        return false;
    }

    public boolean isExit(String input) {
        if(input.isEmpty()) {
            System.out.println("Enter 'start' to enter the game or Enter 'exit' to close the game.");
            return false;
        } else if(input.matches("exit")) {
            return true;
        }
        return false;
    }

    public boolean isDefault(String input) {
        if(input.isEmpty()) {
            System.out.println("Enter 'default' to begin the game with the default values");
            System.out.println("Enter 'setup' to set your own values for the game");
            return false;
        } else if(input.matches("default")) {
            return true;
        }
        return false;
    }
    public boolean isSetup(String input) {
        if(input.isEmpty()) {
            System.out.println("Enter 'default' to begin the game with the default values");
            System.out.println("Enter 'setup' to set your own values for the game");
            return false;
        } else if(input.matches("setup")) {
            return true;
        }
        return false;
    }
}
