import java.util.Arrays;
import java.util.Scanner;

public class DemBien {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random() * 100);
        }Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Menu");
            System.out.println(Arrays.toString(arr));
            System.out.println("9999.Exit");
            System.out.println("Enter value: ");
            num = scanner.nextInt();
            int count=0;
            for (int i=0;i< arr.length;i++){
                if (num==arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }while (num != 9999);

    }
}
