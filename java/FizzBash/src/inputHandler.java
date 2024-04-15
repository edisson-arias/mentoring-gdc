import java.util.Scanner;

public class inputHandler {
    private Scanner userInput;
    

    public inputHandler() {
        userInput = new Scanner(System.in);
    }

    public String getUserInput() {
        return userInput.nextLine();
    }


    
}
