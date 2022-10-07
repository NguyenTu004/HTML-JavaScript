import java.util.Arrays;

public class DuongCheo {
    public static void main(String[] args) {
        int[][] arr = new int[20][20];
        int sum1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = (int) (Math.random() * 100);
            }
        }
        sum1=0;
        for (int i=0;i<arr.length;i++){
           sum1 += arr[i][i];
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum1);
    }
}
