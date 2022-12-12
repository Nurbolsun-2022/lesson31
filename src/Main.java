import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        int size = 20;
        int[] array = new int[size];
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < size; i++) {
            int random = rn.nextInt(0, 100);
            array[i] = random;
            if (array[i] > 50) {
                sum += array[i];
            } else if (array[i] < 50) {
                sum1 += array[i];
            }
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("array>50:"+sum);
        System.out.println("array<50:"+sum1);
    }
}

