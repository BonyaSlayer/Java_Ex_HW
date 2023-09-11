package Task2;
import java.util.Arrays;




public class Main {
    public static void main(String[] args) {
        try {
            int d = 0;
            double[] catchedRes1 = new double[8];
            int[] arr = new int[catchedRes1.length];
            for (int i = 0; i < arr.length; i++) {
                catchedRes1[i] = (double)(arr[i] / d);
            }
            System.out.println("catchedRes1 = " + Arrays.toString(catchedRes1));
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
}    
}
