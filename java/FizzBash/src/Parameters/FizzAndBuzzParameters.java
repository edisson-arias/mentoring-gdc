package Parameters;
import Utilities.InputHandler;

public class FizzAndBuzzParameters implements IFizzAndBuzzParameters {

    InputHandler input = new InputHandler();
    
    public int getFizz() {
        return input.getInputAsInteger();
    }

    public int getBuzz() {
        return input.getInputAsInteger();
    }

    public String getFizzName() {
        return input.getInputAsString();
    }

    public String getBuzzName() {
        return input.getInputAsString();
    }

}