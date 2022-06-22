import java.util.Scanner;

public class ExtraWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a positive integer n: ");
            n = scan.nextInt();

        }while(n <= 0);

        int sum;
        while(n >= 10) {
            sum = 0;
            for (int i = n; i != 0; i/=10){
                sum += i%10;
            }
            n = sum;
        }
        System.out.println("Single digit result: " + n);
    }
}
