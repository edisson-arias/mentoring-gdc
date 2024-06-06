package Games;
import Utilities.OutputHandler;
import Data.Algorithm;
import Data.Data;
import Parameters.FizzAndBuzzParameters;
import Parameters.ParametersProcessor;

public class FizzBuzzGame implements Game {

    Data data = new Data();
    OutputHandler output = new OutputHandler();
    FizzAndBuzzParameters FBparameters = new FizzAndBuzzParameters();
    ParametersProcessor parameters = new ParametersProcessor();

    public void Phase1() {
        output.welcomeMsg("FizzBuzz");
        output.enterMsg("limit", "number");
        data.setLimit(parameters.getLimit());
        output.setMsg("limit");
    }

    public void Phase2() {
        output.enterMsg("Fizz", "number");
        data.setFizz(FBparameters.getFizz());
        output.setMsg("Fizz");
    }

    public void Phase3() {
        output.enterMsg("Buzz", "number");
        data.setBuzz(FBparameters.getBuzz());
        output.setMsg("Buzz");
    }

    public void Phase4() {
        output.enterMsg("Fizz", "word");
        data.setFizzName(FBparameters.getFizzName());
        output.setMsg(data.getFizzName());
    }

    public void Phase5() {
        output.enterMsg("Buzz", "word");
        data.setBuzzName(FBparameters.getBuzzName());
        output.setMsg(data.getFizzName());
    }


    
    

    public void startGame() {

        Phase1();
        Phase2();
        Phase3();
        Phase4();
        Phase5();
        data.printData();
        
        Algorithm.startAlgorithm(data);
        
        data.printResults();

    }

}
