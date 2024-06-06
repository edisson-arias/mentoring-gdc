package Utilities;

public class OutputHandler {
    public void print(Object message) {
        System.out.println(message);
    }

    public void welcomeMsg(String gameMode) {
        System.out.println("=================== WELCOME TO " + gameMode.toUpperCase() + " ===================");
        System.out.println("-----------------------------------------------------------");
    }

    public void enterMsg(String type, String speicifcObject) {
        System.out.println("Enter in the " + type + " " + speicifcObject + ": ");
    }

    public void setMsg(String type) {
        System.out.println(type + " set!");
        System.out.println("-----------------------------------------------------------");
    }

    public void error() {
        System.out.println("Invalid  entered. Please try again.");
    }

    public void nullString() {
        System.out.println("ERROR: This input cannot be empty");
    }

    public void wordString() {
        System.out.println("ERROR: This input cannot use words or letters");
    }

    public void defaultSetting() {
        System.out.println("Setting to Default");
    }


}
