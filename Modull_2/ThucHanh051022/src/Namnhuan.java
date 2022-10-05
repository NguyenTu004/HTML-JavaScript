import java.util.Scanner;

public class Namnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        String leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            leap = "%d is a leap year ";
        } else {
            leap = "%d Not is a leap year ";
        }
        System.out.println(leap + year);
    }
}
