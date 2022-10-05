import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String days;
        System.out.println("Which month that you want to count days ?");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                days="28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days="30";
                break;
            default:
                days="";
                break;
        }
        System.out.println("The month "+month+" has "+days+" days!!");
    }
}
