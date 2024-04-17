public class Algorithm {

    public static void startAlgorithm(Data data) {

        int limit = data.getLimit();
        int fizz = data.getFizz();
        int buzz = data.getBuzz();
        String fizzName = data.getFizzName();
        String buzzName = data.getBuzzName();

        for (int i = 1; i <= limit; i++) {
            if (i % fizz == 0 && i % buzz == 0) {
                System.out.println(fizzName + buzzName);
            } else if (i % fizz == 0) {
                System.out.println(fizzName);
            } else if (i % buzz == 0) {
                System.out.println(buzzName);
            } else {
                System.out.println(i);
            }
        }
    }
    
}
