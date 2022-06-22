import java.util.Scanner;

public class ExtraWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter an odd integer n greater than or equal to 5: ");
            n = scan.nextInt();
        } while (n % 2 == 0 || n < 5);

        boxWithMinorDiagonal(n);
        System.out.println();
        rightTriangle(n);
        System.out.println();
        printNLetter(n);
        System.out.println();
        fancySquare(n);
        System.out.println();
        plusInSquare(n);

    }
    public static void boxWithMinorDiagonal(int n){
        String topAndBottom = "";
        for(int i = 0; i != n; i++ ){
            topAndBottom += "*";
        }
        System.out.println(topAndBottom);
        for(int i = 1; i != n - 1; i++){            //i is each row
            for (int j = 0; j!=n; j++){
                if (j==0 || j == n-1){              //j is the cursor/print position for each individual row
                    System.out.print("*");
                }
                else if (n - j == i + 1){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(topAndBottom);
    }
    public static void rightTriangle(int n){
        String bottom = "*";
        for(int i = 1; i != n; i++){                //i is the row
            for(int j = 1; j!= i + 1; j++){         //j is the print position on each row
                if (j == i || j == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            bottom += "*";
            System.out.println();
        }
        System.out.println(bottom);
    }

    public static void printNLetter(int n){
        for(int i = 1; i != n + 1; i++){                //i is the row
            for(int j = 1; j!= n + 1; j++){             //j is the print position on each row
                if (j == i || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void fancySquare(int n){
        String topAndBottom = "@";
        for(int i = 1; i != n - 1; i++ ){
            topAndBottom += "*";
        }
        topAndBottom += "@";
        System.out.println(topAndBottom);
        int middleAt = n/2 + 1;
        for(int i = 2; i != n; i++){                    //i is each row
            for (int j = 1; j!= n + 1; j++){
                if (j == middleAt && i == middleAt){
                    System.out.print("@");
                }
                else if (j==1 || j == n){              //j is the cursor/print position for each individual row
                    System.out.print("*");
                }
                else if (j == i || j == n - i + 1){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(topAndBottom);
    }
    public static void plusInSquare(int n){
        String topAndBottom = "";
        for(int i = 1; i != n + 1; i++ ){
            topAndBottom += "X";
        }
        System.out.println(topAndBottom);
        int middlePlus = n/2 + 1;
        for(int i = 2; i != n; i++){                                        //i is each row
            for (int j = 1; j!= n + 1; j++){
                if (j == 1 || j == n){
                    System.out.print("X");
                }
                else if (j == middlePlus || i == middlePlus){              //j is the cursor/print position for each individual row
                    System.out.print("+");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println(topAndBottom);
    }
}
