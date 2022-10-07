public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] matrix = new int[10][10];
        // giá trị ngẫu nhiên
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        //In mảng
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        //Xáo trộn mảng ngẫu nhiên
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);
                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
        //Copy mảng
            char [] sourceArray = {'D', 'H', 'A', 'N', 'B', 'A', 'D'};
            char [] targetArray = new char [sourceArray.length];
            System.arraycopy (sourceArray, 0, targetArray, 0, 7);
                                            // srcPos : vị trí copy
                                            // destPos : vị trí page
                                            // length : độ dài copy
        System.out.println(targetArray);
    }
}