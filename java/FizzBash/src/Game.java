public class Game {

    Data data = new Data();

    /*
     * Phases
     * 
     * Phase 0
     *      EXIT
     * Phase 1
     *      START
     * Phase 2
     *      CONFIG
     * Phase 3
     *      DEFAULT
     * Phase 4
     *      SETUP
     * Phase 5
     *      ALGORITHM
     * 
     */

    public void startGame() {

////////// Phase 1 (START)

        inputHandler input = new inputHandler();

        System.out.println("=================== WELCOME TO FIZZBUZZ ===================");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Enter 'start' to enter the game or Enter 'exit' to close the game.");
        /* if start
         * 
         * do phase 2 (CONFIG)
         * 
         * else if exit
         * 
         * do phase 0 (EXIT)
         *    System.exit(0);
         * 
         */

////////// Phase 2 (CONFIG)

        System.out.println("You can either start with Default values");
        System.out.println("Or set your own values for the game");

        System.out.println("Enter 'default' to begin the game with the default values");
        /* if default
         *
         * ask for limit
         * 
         * do phase 3 (DEFAULT)
         *      data.setBuzz(3);
         *      data.setFizz(5);
         *      data.setFizzName("Fizz");
         *      data.setBuzzName("Buzz");
         * 
         * do phase 5
         *      Algorithm.startAlgorithm(data);
         */
        System.out.println("Enter 'setup' to set your own values for the game");
        /* if setup
         * 
         * do phase 4 (SETUP)
         *      ask for limit
         *      ask for fizz
         *      ask for buzz
         *      ask for fizzName
         *      ask for buzzName
         * 
         * do phase 5 (ALGORITHM)
         *      Algorithm.startAlgorithm(data);
         */

////////// Phase 3 (DEFAULT)

        // TODO: start default

////////// Phase 4 (SETUP)

        data.setLimit(input.getSetupInputInt("Enter the amount of numbers: ", "Limit set to: "));
        
        data.setBuzz(input.getSetupInputInt("Enter the Fizz Number: ", "Fizz set to: "));
        
        data.setFizz(input.getSetupInputInt("Enter the Buzz Number: ", "Buzz set to: "));
        
        data.setFizzName(input.getSetupInputString("Enter the first word: ", "First word set to: "));

        data.setBuzzName(input.getSetupInputString("Enter the second word: ", "Second word set to: "));

////////// Phase 5 (ALGORITHM)

        System.out.println("=================== INPUTS REGISTERED ===================");
        System.out.println("---------------------------------------------------------");

        Algorithm.startAlgorithm(data);
    }

    


    

}
