import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = scan.nextInt();
        int count = 1;
        int sum = 0;
        while (count <= n)
        {
            if (count % 2 == 0)
            {
                sum += count;

            }
            count++;
        }
        System.out.println("The sum of all even numbers between 1 and " + n + " is: " + sum);

    }
}
