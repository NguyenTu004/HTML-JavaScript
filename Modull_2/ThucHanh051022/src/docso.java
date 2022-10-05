import java.util.Scanner;

public class docso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int sum1,sum2,num = scanner.nextInt();
        String text1="",text2="";
        if (num<=20){
            switch (num){
                case 0: text1="Zero";break;
                case 1: text1="One";break;
                case 2: text1="Two";break;
                case 3: text1="Three";break;
                case 4: text1="Four";break;
                case 5: text1="Five";break;
                case 6: text1="Six";break;
                case 7: text1="Seven";break;
                case 8: text1="Eight";break;
                case 9: text1="Nine";break;
                case 10: text1="Ten";break;
                case 11: text1="eleven";break;
                case 12: text1="twelve";break;
                case 13: text1="thirteen";break;
                case 14: text1="fourteen";break;
                case 15: text1="fifteen";break;
                case 16: text1="sixteen";break;
                case 17: text1="seventeen";break;
                case 18: text1="eighteen";break;
                case 19: text1="nineteen";break;
                case 20: text1="twenty";break;
            }
            System.out.println(text1);
        } else {
            sum1=num/10;
            sum2=num%10;
            switch (sum1){
                case 2:text1="twenty";break;
                case 3:text1="thirty";break;
                case 4:text1="forty";break;
                case 5:text1="fifty";break;
                case 6:text1="sixty";break;
                case 7:text1="seventy";break;
                case 8:text1="eighty";break;
                case 9:text1="ninety";break;
            }
            switch (sum2){
                case 1: text2="one";break;
                case 2: text2="two";break;
                case 3: text2="three";break;
                case 4: text2="four";break;
                case 5: text2="five";break;
                case 6: text2="six";break;
                case 7: text2="seven";break;
                case 8: text2="eight";break;
                case 9: text2="nine";break;
            }
            System.out.println(text1+" "+text2);
        }
    }
}
