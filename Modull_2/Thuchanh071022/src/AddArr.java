import java.util.Arrays;
import java.util.Scanner;

public class AddArr {
    public static void main(String[] args) {
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random() * 100);
        }
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        do {
            System.out.println("Menu");
            System.out.println(Arrays.toString(arr));
            System.out.println("99. Exit!!");
            System.out.println("Enter value: ");
            num1=scanner.nextInt();
            System.out.println("Enter index add: ");
            num2 = scanner.nextInt();
            int[] arr1 = Add(arr,num1,num2);
            System.out.println(Arrays.toString(arr1));
        }while (num1!=99);
    }
    public static int[] Add(int[] arr,int num1,int num2){
        int[] arr2 = new int[arr.length+5];
        for (int i=0;i< arr.length;i++){
            if (num2==i){
                arr2[i]=num1;
                for (int j =num2+1;j<arr.length+1;j++){
                    arr2[j]=arr[j-1];
                }
                break;
            }else {
                arr2[i]=arr[i];
            }
        }
        return arr2;
    }
}
