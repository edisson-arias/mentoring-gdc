package Parameters;
import Utilities.InputHandler;

public class ParametersProcessor implements IParametersProcessor{

    InputHandler input = new InputHandler();

    public int getLimit() {
        return input.getInputAsInteger();
    }

    
}
