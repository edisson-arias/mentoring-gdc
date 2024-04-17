public class Game {

    Data data = new Data();

    public void startGame() {

       // Phase 1 

        inputHandler input = new inputHandler();

        System.out.println("=================== WELCOME TO FIZZBUZZ ===================");
        System.out.println("-----------------------------------------------------------");

        System.out.println("You can either start with Default values");
        System.out.println("Or set your own values for the game");

        System.out.println("Enter 'start' to begin the game with the default values");
        /* if start
         *
         * ask for limit
         * 
         * do phase 2
         *      data.setBuzz(3);
         *      data.setFizz(5);
         *      data.setFizzName("Fizz");
         *      data.setBuzzName("Buzz");
         * 
         * do phase 4
         *      Algorithm.startAlgorithm(data);
         */
        System.out.println("Enter 'setup' to set your own values for the game");
        /* if setup
         * 
         * do phase 3
         *      ask for limit
         *      ask for fizz
         *      ask for buzz
         *      ask for fizzName
         *      ask for buzzName
         * 
         * do phase 4
         *      Algorithm.startAlgorithm(data);
         */
        System.out.println("Enter 'exit' to quit the game");
        /* if exit
         * 
         * do phase 0
         *    System.exit(0);
         * 
         */

        // Phase 2

        // TODO: start default

        // Phase 3

        data.setLimit(input.getInputAsInteger("Enter the amount of numbers: ", "Limit set to: "));
        
        data.setBuzz(input.getInputAsInteger("Enter the Fizz Number: ", "Fizz set to: "));
        
        data.setFizz(input.getInputAsInteger("Enter the Buzz Number: ", "Buzz set to: "));
        
        data.setFizzName(input.getInputAsString("Enter the first word: ", "First word set to: "));

        data.setBuzzName(input.getInputAsString("Enter the second word: ", "Second word set to: "));

        // Phase 4

        System.out.println("=================== INPUTS REGISTERED ===================");
        System.out.println("---------------------------------------------------------");

        Algorithm.startAlgorithm(data);
    }

    


    

}
