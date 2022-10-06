import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int num = scanner.nextInt();
        boolean flag=false;
        if (num<2){
            flag=false;
        }else {
            for (int i = 2;i < num;i++){
                if (num % i ==0){
                    flag=false;
                }else {
                    flag=true;
                }
            }
        }
        if (flag){
            System.out.println(num+" Is a prime!");
        }else {
            System.out.println(num+" Not a prime!");
        }
    }
}
