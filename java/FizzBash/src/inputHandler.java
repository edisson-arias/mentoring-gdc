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


    public int getSetupInputInt(String askString, String outputString) {
        boolean loopGuard = true;
        String current;
        int result = -1;
        while(loopGuard) {                                                     
            System.out.println(askString);
            current = getRawInput();
                if(validator.isNumValid(current)) {
                    result = Integer.parseInt(current);
                    System.out.println(outputString + " " + result);
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
        }
        return result;
    }

    public String getSetupInputString(String askString, String outputString) {
        boolean loopGuard = true;
        String current;
        String result = "";
        
        while(loopGuard) {                                                     
            System.out.println(askString);
            current = getRawInput();
                if(validator.isStringValid(current)) {

                        result = current;
                    
                    result = current;
                    System.out.println(outputString + " " + result);
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
        }
        return result;
    }


    
}
