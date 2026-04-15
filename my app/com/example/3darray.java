public calss 3darray {
    public static void main(String[] args) {
        int[][][] array3D = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        int sum = 0;

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    sum += array3D[i][j][k];
                }
            }
        }

        System.out.println("Sum of 3D array elements: " + sum);
    }
    
}