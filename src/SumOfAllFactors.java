import java.util.Scanner;

public class SumOfAllFactors {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Enter an integer greater than 1: ");
        int n = l.nextInt();

        int count = 1;
        int sum = 0;

        while (count <= n) {

            if (n % count == 0) {
                sum += count;

            }
            count++;

        }
        System.out.println(sum);
    }
}
