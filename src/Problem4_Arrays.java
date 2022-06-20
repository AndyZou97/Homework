import java.util.Scanner;

public class Problem4_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter integer n greater than 10: ");
            n = scan.nextInt();
        }while(n <= 10);
        int[] arr = new int [n];

        System.out.println("Before swap:");
        for(int i = 0; i < arr.length; i++){
        arr[i] = (int) (Math.random()*74 + 2);
        System.out.print(arr[i] + " ");
        }
        System.out.print("\n" + "Sum of elements at indexes 2, 5, 7, and 9 is: " );
        System.out.println(arr[2] + arr[5] + arr[7] + arr[9]);
        int temp = 0;
        temp = arr[2];
        arr[2] = arr[6];
        arr[6] = temp;

        temp = arr[4];
        arr[4] = arr[7];
        arr[7] = temp;
        System.out.println("\n" + "After swap:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n" + "Sum of elements at indexes 2, 5, 7, and 9 is: ");
        System.out.println(arr[2] + arr[5] + arr[7] + arr[9]);


    }
}
