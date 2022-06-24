public class TwoDArray1 {
    public static void main(String[] args) {
        int arr[][] = {{4,9,5,3},{3,10,1,7},{13,1,3,4}};
        System.out.println(isRowMagic(arr));
        int arr2[][] = {{31, 1, -1, 15, 10},{21,18,5,4,8}};
        System.out.println(isRowMagic(arr2));
        int arr3[][] = {{4,8,7},{2,9,6}};
        System.out.println(isRowMagic(arr3));
    }
    public static boolean isRowMagic(int[][] arr) {
        int sum = 0;
        int lastSum = 0;
        int count = 0;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if(sum == lastSum && row !=0) {
                count += 1;
            }
            lastSum = sum;
            sum = 0;
        }
        if(count == arr.length - 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
