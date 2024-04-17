import java.util.Scanner;

public class inputHandler {
    private Scanner userInput;
    private Validator validator = new Validator();
    

    public inputHandler() {
        userInput = new Scanner(System.in);
    }

    public String getUserInput() {
        return userInput.nextLine();
    }


    public int getInputAsInteger(String ask, String setMessage) {
        boolean loopGuard = true;
        String current;
        int result = -1;
        while(loopGuard) {                                                     
            System.out.println(ask);
            current = getUserInput();
                if(validator.isNumValid(current)) {
                    result = Integer.parseInt(current);
                    System.out.println(setMessage + " " + result);
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
        }
        return result;
    }

    public String getInputAsString(String ask, String setMessage) {
        boolean loopGuard = true;
        String current;
        String result = "";
        
        while(loopGuard) {                                                     
            System.out.println(ask);
            current = getUserInput();
                if(validator.isStringValid(current)) {

                        result = current;
                    
                    result = current;
                    System.out.println(setMessage + " " + result);
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
        }
        return result;
    }


    
}
