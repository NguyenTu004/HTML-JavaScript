import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        double weight, height, bmi;
        System.out.println("You weight: ");
        weight=scanner.nextDouble();
        System.out.println("You height: ");
        height=scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        if (bmi<18){
            text="Underweight";
        }else if (bmi<25){
            text="Normal";
        }else if (bmi<30){
            text="Overweight";
        }else {
            text="Obese";
        }
        System.out.println("BMI= "+bmi+" : "+text);
    }
}
