import java.util.Scanner;

public class USDvaVND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usd,vnd;
        System.out.println("USD: ");
        usd=scanner.nextInt();
        vnd=usd*23000;
        System.out.println(usd+" USD = "+vnd+" VND");
    }
}
