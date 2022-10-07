import java.util.Scanner;

public class DoFdoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doF,doC;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius!");
            System.out.println("2. Celsius to Fahrenheit!");
            System.out.println("0. Exit!!");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                doF = scanner.nextDouble();
                    doC = (doF-32)*(5.0/9);
                    System.out.println("Fahrenheit: "+doF+" to "+"Celsius "+doC);
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    doC = scanner.nextDouble();
                    doF = (doC+32)*(9.0/5);
                    System.out.println("Celsius: "+doC+" to "+"Fahrenheit "+doF);
                    break;
            }
        }while (choice != 0);
    }
}
