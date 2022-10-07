import java.util.Arrays;

public class MergeArr {
    public static void main(String[] args) {
        int[] arr1 = new int[11];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= (int) (Math.random() * 100);
        }
        int[] arr2 = new int[11];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= (int) (Math.random() * 100);
        }
        int[] arr3 = Merge(arr1,arr2);

//        int[] arr3 = new int[30];
//        System.arraycopy(arr1,0,arr3,0,arr1.length);
//        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);

        System.out.println("Arr1: "+ Arrays.toString(arr1));
        System.out.println("Arr2: "+ Arrays.toString(arr2));
        System.out.println("Arr3: "+ Arrays.toString(arr3));
    }
    public static int[] Merge(int[] arr1,int[] arr2){
        int[] arr3 = new int[ arr1.length+ arr2.length];
        for (int i =0; i< arr3.length;i++){
            if (i<arr1.length){
                arr3[i]=arr1[i];
            }else{
                arr3[i]=arr2[i- arr1.length];
            }
        }
        return arr3;
    }
}
