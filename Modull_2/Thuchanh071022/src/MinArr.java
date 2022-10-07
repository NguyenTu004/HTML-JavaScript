public class MinArr {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = Min(arr);
        System.out.println(index);
    }
    public static int Min(int[] arr){
        int min = arr[0];
        for (int i = 1;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
