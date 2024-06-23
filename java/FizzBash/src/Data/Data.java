package Data;
import Utilities.OutputHandler;

public class Data {

    OutputHandler output = new OutputHandler();

    /* Data */
    
    private int fizz;
    private int buzz;
    private int limit;
    private String fizzName;
    private String buzzName;
    private int noFizz;
    private int noBuzz;
    private int noFizzBuzz;

    /* Setters */

    public void setBuzzName(String buzzName) {
        this.buzzName = buzzName;
    }

    public void setFizzName(String fizzName) {
        this.fizzName = fizzName;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setFizz(int fizz) {
        this.fizz = fizz;
    }

    public void setBuzz(int buzz) {
        this.buzz = buzz;
    }

    // TODO: Base of Math more than counting for better complexity
    
    public  void setNoFizz(int noFizz) {
        this.noFizz = noFizz;
    }  

    public void setNoBuzz(int noBuzz) {
        this.noBuzz = noBuzz;
    }

    public void setNoFizzBuzz(int noFizzBuzz) {
        this.noFizzBuzz = noFizzBuzz;
    }

    /* Getters */

    public int getFizz() {
        return fizz;
    }

    public int getBuzz() {
        return buzz;
    }

    public int getLimit() {
        return limit;
    }

    public String getFizzName() {
        return fizzName;
    }

    public String getBuzzName() {
        return buzzName;
    }

    public int getNoFizz() {
        return noFizz;
    }

    public int getNoBuzz() {
        return noBuzz;
    }

    public int getNoFizzBuzz() {
        return noFizzBuzz;
    }

    // Print data  

    public void printData() {
        output.print("Fizz: " + fizz);
        output.print("Buzz: " + buzz);
        output.print("Limit: " + limit);
        output.print("Fizz name: " + fizzName);
        output.print("Buzz name: " + buzzName);
    }

    // TODO: See above

    public void printResults() {
        output.print("Number of Fizz: " + noFizz);
        output.print("Number of Buzz: " + noBuzz);
        output.print("Number of FizzBuzz: " + noFizzBuzz);
        output.print("Number of other numbers: " + (limit - noFizz - noBuzz - noFizzBuzz));
    }

}
