public class jaggedarray {
    public static void main(String[] args) {
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                sum += jaggedArray[i][j];
            }
        }

        System.out.println("Sum of jagged array elements: " + sum);
    }
    
}
