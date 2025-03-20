package javaArrays;
public class Array2 {
    
    public static void multiD_Array(int[][] arr) {
        int sum = 0;
        int j = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[i][j];
            j += 1;
        }
        System.out.println("Sum of diagonal element = " + sum);
    }
    public static void main(String[] args) {
        
        // int multi_d[][] = new int[2][2];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < multi_d[0].length; i++) {
        //     for (int j = 0; j < multi_d[0].length; j++) {
        //         multi_d[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < multi_d[0].length; i++) {
        //     System.out.println("");
        //     System.out.printf("|");
        //     for (int j = 0; j < multi_d[0].length; j++) {
        //         System.out.printf("\t%d ", multi_d[i][j]);
        //     }
        //     System.out.printf("\t|");
        // }
        int new_mat[][] = {
                { 1, 2 },
                { 3, 4 }
        };
        
        int new_mat2[][] = {
                { 5,6},
                { 2,2},
        };
        if (((new_mat.length * new_mat[0].length) / new_mat[0].length) == new_mat2[0].length) {
            System.out.println("Row of first == col of second");
        // System.out.println("");
        // multiD_Array(multi_d);
        
        int new_mat3[][] = new int[(new_mat.length * new_mat[0].length)/new_mat[0].length][new_mat2[0].length];
        for (int i = 0; i < new_mat3.length; i++) {
            for (int j = 0; j < new_mat3[0].length; j++) {
                for (int k = 0; k < new_mat[0].length; k++) {
                    new_mat3[i][j] += new_mat[i][k] * new_mat2[k][j];
                }
            }
        }
        for (int i = 0; i < new_mat3.length; i++) {
            System.out.println("");
            System.out.printf("|");
            for (int j = 0; j < new_mat3.length; j++) {
                System.out.printf("\t%d\t", new_mat3[i][j]);
            }
            System.out.println("|");
        }
        }
    }
}
