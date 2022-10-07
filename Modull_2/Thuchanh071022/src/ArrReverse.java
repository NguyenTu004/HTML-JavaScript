import java.util.Scanner;

public class ArrReverse {
    public static void main(String[] args) {
        int[] arr = new int[10] ;
        Scanner scanner = new Scanner(System.in);
        int i =0;
        while (i < arr.length){
            System.out.println("Enter element"+(i+1)+":");
            arr[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in arr: ", "");
        // for_each không lấy đc vị trí index
        for (int k : arr) {
            System.out.print(k + "\t");
        }
        for (int j =0;j< arr.length / 2;j++){
            int test = arr[j];
            arr[j]=arr[arr.length-1-j];
            arr[arr.length-1-j]=test;
        }
        System.out.printf("\n%-20s%s", "Reverse arr: ", "");
        for (int j =0;j< arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
    }
}
