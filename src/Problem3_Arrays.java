public class Problem3_Arrays {
    public static void main(String[] args) {
        int [] intArray = {2, 3, 9, 17, 32, 40, 73, 40, 21, 10};
        System.out.println("Before shifting:");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n");

        int firstElement = intArray[0];

        for(int i = 0; i < intArray.length - 1; i++){
            intArray[i] = intArray[i+1];
        }
        intArray[intArray.length - 1] = firstElement;
        System.out.println("After shifting:");

        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

    }
}
