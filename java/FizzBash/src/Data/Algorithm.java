package Data;
import Utilities.OutputHandler;

public class Algorithm {

    public static void startAlgorithm(Data data) {

        OutputHandler output = new OutputHandler();
       
        // TODO: Base of Math more than counting for better complexity
       
        int fizzCount = 0;                               
        int buzzCount = 0;
        int fizzBuzzCount = 0;

        for (int i = 1; i <= data.getLimit(); i++) {

            if (i % data.getFizz() == 0 && i % data.getBuzz() == 0) {

                fizzBuzzCount++;

                output.print(data.getFizzName() + data.getBuzzName());
            } else if (i % data.getFizz() == 0) {
                
                fizzCount++;

                output.print(data.getFizzName());
            } else if (i % data.getBuzz() == 0) {

                buzzCount++;

                output.print(data.getBuzzName());
            } else {
                output.print(i);
            }

        }
        data.setNoFizz(fizzCount);
        data.setNoBuzz(buzzCount);
        data.setNoFizzBuzz(fizzBuzzCount);
    }
    
}
