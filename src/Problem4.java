import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = scan.nextInt();
        int n1 = Math.abs(n);
        int sum = 0;
        while(n1 != 0){
            sum += n1%10;
            n1 /= 10;
        }
        System.out.println("The sum of all digits of " + n + " is: " + sum);
    }
}
