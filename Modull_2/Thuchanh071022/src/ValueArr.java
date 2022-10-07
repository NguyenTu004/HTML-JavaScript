import java.util.Scanner;

public class ValueArr {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's students: " );
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i =0;i<students.length;i++){
            if (students[i].equals(name)){
                System.out.println("Position of the students in the list " + name + " is: " + i);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Not name!!");
        }
    }
}
