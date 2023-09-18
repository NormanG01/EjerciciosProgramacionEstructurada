public class DeterminarRapidezComputadora {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int count = 0;
        int target = 1000000;

        while (count < 300000000) {
            count++;
            if (count % target == 0) {
                long endTime = System.currentTimeMillis();
                System.out.println("Iteración " + count + ": Tiempo transcurrido (ms) = " + (endTime - startTime));
                target += 1000000;
            }
        }
    }
}
