import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money,interestRate,totalInterest=0;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter nu,ber of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();
        for (int i=0;i<month;i++){
            totalInterest = money*(interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: "+totalInterest);
    }
}
