import java.util.Scanner;

public class Prime_20 {
    public static void main(String[] args) {
        int count =0,N=2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n = scanner.nextInt();
      for (int i=N;count < n;i++){
          boolean check = check(i);
          if (check){
              System.out.println(i);
              count++;
          }
        }
    }
    public static boolean check(int num){
        boolean flag = true;
        if (num<2){
            flag=false;
        }else {
            for (int i=2;i<num;i++){
                if (num % i == 0){
                    flag=false;
                }
            }
        }
        return flag;
    }
}
