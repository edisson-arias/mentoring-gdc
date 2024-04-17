import java.util.Scanner;

public class inputHandler {
    private Scanner userInput;
    private Validator validator = new Validator();
    

    public inputHandler() {
        userInput = new Scanner(System.in);
    }

    public String getRawInput() {
        return userInput.nextLine();
    }


    public int getSetupInputInt() {
        boolean loopGuard = true;
        String current;
        int result = -1;
        while(loopGuard) {                                                     
            current = getRawInput();
                if(validator.isNumValid(current)) {
                    result = Integer.parseInt(current);
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
        }
        return result;
    }

    public String getSetupInputString() {
        boolean loopGuard = true;
        String current;
        String result = "";
        
        while(loopGuard) {                                                     
            current = getRawInput();
                if(validator.isStringValid(current)) {

                        result = current;
                    
                    result = current;
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
        }
        return result;
    }


    
}
