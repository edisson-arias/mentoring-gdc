package Utilities;
import java.util.Scanner;

public class InputHandler {
    private Scanner userInput;

    Validator validator = new Validator();
    
    public InputHandler() {
        userInput = new Scanner(System.in);
    }

    public String getUserInput() {
        return userInput.nextLine();
    }

    public int getInputAsInteger()
    {
        boolean loopGuard = true;
        String current;
        int result = -1;
        while(loopGuard) {                                                      
            current = getUserInput();
                if(validator.isNumValid(current)) {
                    result = Integer.parseInt(current);
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
        }
        return result;
    }

    public String getInputAsString()
    {
        boolean loopGuard = true;
        String current;
        String result = "null";
        while(loopGuard) {                                                      
            current = getUserInput();
                if(validator.isStringValid(current)) {
                    result = current;
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
        }
        return result;
    }

    public void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    
}
