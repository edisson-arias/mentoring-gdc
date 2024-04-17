public class Game {

    Data data = new Data();

    public void startGame() {

       // Phase 1 

        inputHandler input = new inputHandler();
        Validator validator = new Validator();

        System.out.println("=================== WELCOME TO FIZZBUZZ ===================");
        System.out.println("-----------------------------------------------------------");

        // Phase 2

        data.setLimit(getInputAsInteger("Enter the amount of numbers: ", "Limit set to: ", input, validator));
        
        data.setBuzz(getInputAsInteger("Enter the Fizz Number: ", "Fizz set to: ", input, validator));
        
        data.setFizz(getInputAsInteger("Enter the Buzz Number: ", "Buzz set to: ", input, validator));
        
        data.setFizzName(getInputAsString("Enter the first word: ", "First word set to: ", input, validator));

        data.setBuzzName(getInputAsString("Enter the second word: ", "Second word set to: ", input, validator));

        // Phase 3

        System.out.println("=================== INPUTS REGISTERED ===================");
        System.out.println("---------------------------------------------------------");

        Algorithm.startAlgorithm(data);
    }

    public int getInputAsInteger(String ask, String setMessage, inputHandler input, Validator validator) {
        boolean loopGuard = true;
        String current;
        int result = -1;
        while(loopGuard) {                                                     
            System.out.println(ask);
            current = input.getUserInput();
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

    public String getInputAsString(String ask, String setMessage, inputHandler input, Validator validator) {
        boolean loopGuard = true;
        String current;
        String result = "";
        
        while(loopGuard) {                                                     
            System.out.println(ask);
            current = input.getUserInput();
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
