import Games.FizzBuzzGame;
import Games.Game;
import Utilities.OutputHandler;
import Utilities.InputHandler;

public class App {
    public static void main(String[] args) throws Exception {

        OutputHandler startupOutput = new OutputHandler();
        InputHandler startupInput = new InputHandler();

        Game fizzBuzz = new FizzBuzzGame();

        while(true) {
            startupOutput.appChoose();
            String userInput = startupInput.getUserInput();
                
                if(userInput.equals("FB") || userInput.equals("fb")) {
                    startupInput.clearConsole();
                    fizzBuzz.startGame();
                    break;

                } else if(userInput.equals("EO") || userInput.equals("eo")) {
                    startupOutput.print("Not yet implemented. Please try again.");
                    break; 

                } else if(userInput.equals("exit")) {
                    startupOutput.print("Exiting Application");
                    System.exit(0);
                    
                } else {
                    startupOutput.error();
                }
            break;
        }

    }
}
