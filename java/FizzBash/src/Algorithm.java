public class Algorithm {

    public static void startAlgorithm(Data data) {

        for (int i = 1; i <= data.getLimit(); i++) {
            if (i % data.getFizz() == 0 && i % data.getBuzz() == 0) {
                System.out.println(data.getFizzName() + data.getBuzzName());
            } else if (i % data.getFizz() == 0) {
                System.out.println(data.getFizzName());
            } else if (i % data.getBuzz() == 0) {
                System.out.println(data.getBuzzName());
            } else {
                System.out.println(i);
            }
        }
    }
    
}
