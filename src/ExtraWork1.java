import java.util.Scanner;

public class ExtraWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter an integer n, greater than 0: ");
            n = scan.nextInt();

        }while(n <= 0 );
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int) (Math.random()*500 + 1);
        }
        printArray(arr);
        System.out.println("\n" + "Maximum: " + getMax(arr));
        System.out.println("Minimum: " + getMin(arr));
        System.out.println("Sum: " + sumValues(arr));
        System.out.println("Average: " + getAverage(arr));
        System.out.println("Numbers greater than average: " + greaterThanAverage(arr));
        System.out.println("Number of times subsequent value increases : " + countInc(arr));
        System.out.println("Number of times subsequent value decreases : " + countDec(arr));
        printArray3PerLn(arr);
    }
    public static int getMax(int[] Arr){
        int max = Arr[0];
        for(int i = 0; i < Arr.length; i++){
            if(Arr[i] > max){
                max = Arr[i];
            }
        }
        return max;

    }
    public static int getMin(int[] Arr){
        int min = Arr[0];
        for(int i = 0; i < Arr.length; i++){
            if(Arr[i] < min){
                min = Arr[i];
            }
        }
        return min;

    }
    public static int sumValues(int[] Arr){
        int sum = 0;
        for(int i = 0; i < Arr.length; i++){
            sum += Arr[i];
            }
        return sum;
    }
    public static double getAverage(int[] Arr){
        return (double) sumValues(Arr)/Arr.length;
    }
    public static int greaterThanAverage(int[] Arr){
        int numGreater = 0;
        double avg = getAverage(Arr);
        for(int i = 0; i < Arr.length; i++){
            if(Arr[i] > avg){
                numGreater += 1;
            }
        }
        return numGreater;
    }
    public static int countInc(int[] Arr){
        int inc = 0;
        for(int i = 0; i < Arr.length - 1; i++){
            if (Arr[i] < Arr[i+1]){
                inc += 1;
            }
        }
        return inc;
    }
    public static int countDec(int[] Arr){
        int dec = 0;
        for(int i = 0; i < Arr.length - 1; i++){
            if (Arr[i] > Arr[i+1]){
                dec += 1;
            }
        }
        return dec;
    }
    public static void printArray(int[] Arr){
        System.out.println("Array on one line: ");
        for(int i = 0; i < Arr.length ; i++){
            System.out.print(Arr[i] + " ");
            }
    }

    public static void printArray3PerLn(int[] Arr){
        System.out.println("Array with 3 elements per line: ");
        for(int i = 0; i < Arr.length ; i++){
            if ((i + 1) % 3 == 0){
                System.out.println(Arr[i] + " ");
            }
            else{
                System.out.print(Arr[i] + " ");
            }
        }
    }

}
