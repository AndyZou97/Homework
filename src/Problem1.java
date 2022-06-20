import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer x: ");
        int x = scan.nextInt();
        int count = 1;
        while (count <= x)
        {
            if (count % 2 != 0)
            {
                if (count % 3 == 0)
                {
                    System.out.println(count + " is a multiple of 3");
                }
            }
            count++;
        }




    }

}
