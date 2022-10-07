import java.util.Arrays;
import java.util.Scanner;

public class DeleteArr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random() * 100);
        }
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Menu");
            System.out.println(Arrays.toString(arr));
            System.out.println("99. Exit!!");
            System.out.println("Enter index delete: ");
             num = scanner.nextInt();
             int[] arr1 = check1(arr,num);
            System.out.println(Arrays.toString(arr1));
        }while (num!=99);
    }
    public static int[] check1(int[] arr,int num){
        int[] arr1=new int[arr.length];
        for (int i=0;i< arr.length;i++){
            if (num==arr[i]){
                for (int j =i;j<arr.length-1;j++){
                    arr1[j]=arr[j+1];
                }
                break;
            }else {
                arr1[i]=arr[i];
            }
        }
        return arr1;
    }
    public static int[] check2(int[] arr,int num){
        for (int i=0;i< arr.length;i++){
            if (num==arr[i]){
                for (int j =i;j<arr.length-1;) {
                    if (arr[j + 1] == num || (arr[j]==num && arr[j+1]==num)) {
                        arr[j] = arr[j + 2];
                        break;
                    }else {
                        arr[j] = arr[j + 1];
                        j++;
                    }
                }
            }
        }
        return arr;
    }
}
