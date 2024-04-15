public class Data {

    /* Data */
    
    private int fizz;
    private int buzz;
    private int limit;
    private String fizzName;
    private String buzzName;

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

}
