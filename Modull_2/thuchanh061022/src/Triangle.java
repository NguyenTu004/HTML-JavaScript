import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. print the square triangle");
        System.out.println("2. print the rectangle");
        System.out.println("3. print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        String text;
        switch (choice){
            case 1 :
                for (int i = 1;i<=5;i++){
                    text ="";
                    for (int j=1;j<=i;j++){
                        text +=" * ";
                    }
                    System.out.println(text);
                }
                for (int i = 5;i>=1;i--){
                    text ="";
                    for (int j=1;j<=i;j++){
                        text +=" * ";
                    }
                    System.out.println(text);
                }
                break;
            case 2:
                for (int i = 1;i<=5;i++){
                    text ="";
                    for (int j=1;j<=9;j++){
                        text +=" * ";
                    }
                    System.out.println(text);
                }
                break;
            case 3:
                for (int i = 7;i>=1;i--){
                    text ="";
                    for (int j=1;j<=i;j++){
                        text +=" * ";
                    }
                    System.out.println(text);
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!!");
        }
    }
}
