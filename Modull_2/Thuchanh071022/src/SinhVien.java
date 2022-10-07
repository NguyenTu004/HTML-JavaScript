import java.util.Arrays;

public class SinhVien {
    public static void main(String[] args) {
        int[] array = new int[20];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random() * 10);
        }
        for (int i=0;i< array.length;i++){
            if (array[i]>5 && array[i]<10){
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
