import java.util.Arrays;
import java.util.Scanner;

public class ArrayPowers {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter an integer n between 1 and 20: ");
            n = scan.nextInt();
        } while (n > 20 || n < 1);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) Math.pow(2, i);
        }
        System.out.println("Powers of 2: " + Arrays.toString(arr));

    }

}
