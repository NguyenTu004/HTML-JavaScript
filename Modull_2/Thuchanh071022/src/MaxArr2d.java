import java.util.Arrays;

public class MaxArr2d {
    public static void main(String[] args) {
        int[][] arr = new int[12][12];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        int max = arr[0][0];
        int x=0,y=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                    x=i; y=j;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Max value: "+max+" index "+x+","+y);
    }
}
