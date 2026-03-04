package Strings.BufferBuilder;

public class BuilderBufferPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("placement");
        for (int i = 0; i < 100000000; i++) {
            sbf.append("Training");
        }
        System.out.println("Time taken by String Buffer:" + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("placement");
        for (int i = 0; i < 100000000; i++) {
            sbl.append("Training");
        }
        System.out.println("time taken by string builder:" + (System.currentTimeMillis() - startTime) + "ms");
    }
}