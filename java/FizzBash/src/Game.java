public class Game {

    Data data = new Data();

    public void startGame() {
        inputHandler input = new inputHandler();
        Validator validator = new Validator();
        boolean loopGuard = true;
        String current;

        System.out.println("=================== WELCOME TO FIZZBUZZ ===================");
        System.out.println("-----------------------------------------------------------");

        
        while(loopGuard) {                                                      // Have Phases instead of while loops (Phases.java)
            System.out.println("Enter the amount of numbers: ");
            current = input.getUserInput();
                if(validator.isNumValid(current)) {
                    data.setLimit(Integer.parseInt(current));
                    System.out.println("Limit set to: " + data.getLimit());
                    loopGuard = false;
                } else {
                    loopGuard = true;
                }
                
        }
        loopGuard = true;

        
        while(loopGuard) {                                                      // Have Phases instead of while loops (Phases.java)
            System.out.println("Enter the Fizz Number: ");
            current = input.getUserInput();
            if(loopGuard = validator.isNumValid(current)) {
                data.setFizz(Integer.parseInt(current));
                System.out.println("Fizz set to: " + data.getFizz());
                loopGuard = false;
            } else {
                loopGuard = true;
            }
        }
        loopGuard = true;

        
        while(loopGuard) {                                                      // Have Phases instead of while loops (Phases.java)
            System.out.println("Enter the Buzz Number: ");
            current = input.getUserInput();
            if(loopGuard = validator.isNumValid(current)) {
                data.setBuzz(Integer.parseInt(current));
                System.out.println("Buzz set to: " + data.getBuzz());
                loopGuard = false;
            } else {
                loopGuard = true;
            }
        }
        loopGuard = true;
            

        while(loopGuard) {                                                       // Have Phases instead of while loops (Phases.java)
            System.out.println("Enter first word: ");
            current = input.getUserInput();
            if(loopGuard = validator.isStringValid(current)) {
                if(data.getFizzName() == null) {
                    data.setFizzName("Fizz");
                } else {
                    data.setFizzName(current);
                }
                System.out.println("Fizz set to: " + data.getBuzz());
                loopGuard = false;
            } else {
                loopGuard = true;
            }
        }
        loopGuard = true;

        while(loopGuard) {                                                      // Have Phases instead of while loops (Phases.java)
            System.out.println("Enter second word: ");
            current = input.getUserInput();
            if(loopGuard = validator.isStringValid(current)) {
                if(data.getBuzzName() == null) {
                    data.setBuzzName("Buzz");
                } else {
                    data.setBuzzName(current);
                }
                System.out.println("Buzz set to: " + data.getBuzz());
                loopGuard = false;
            } else {
                loopGuard = true;
            }
        }
        loopGuard = true;


        System.out.println("=================== INPUTS REGISTERED ===================");
        System.out.println("---------------------------------------------------------");

        Algorithm.startAlgorithm(data);
    }


    

}
