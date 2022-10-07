import java.util.Arrays;
import java.util.Scanner;

public class TotalArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[12][10];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Menu");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter column: ");
        int column = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==column){
                    total += arr[i][j];
                }
            }
        }
        System.out.println("Total column "+column+" = "+total);
    }
}
