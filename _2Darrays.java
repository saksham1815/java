// import java.util.Scanner;

// public class _2Darrays {
//     public static void main(String args[]) {
//         int[][] numbers = new int[3][3];
//         Scanner sc = new Scanner(System.in);

//         // input
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++)
//                 // prints the array elements
//                 System.out.print(numbers[i][j] + " ");
//             // throws the cursor to the next line
//             System.out.println();
//         }

//     }
// }

import java.util.Scanner;

public class _2Darrays {
    public static void main(String args[]) {
        int i, j, rows, col;

        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        col = sc.nextInt();
        int[][] mat1 = new int[rows][col];
        int[][] mat2 = new int[rows][col];
        int[][] add = new int[rows][col];
        int[][] sub = new int[rows][col];
        int[][] trans = new int[rows][col];
        int[][] mul = new int[rows][col];

        // input mat1
        System.out.println("enter mat1 elements: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("your  mat1 elements are: ");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++)

                System.out.print(mat1[i][j] + " ");

            System.out.println();
        }
        System.out.println("enter mat2 elements: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("your  mat2 elements are: ");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++)

                System.out.print(mat2[i][j] + " ");

            System.out.println();
        }
        // addition
        System.out.println("the addition is : ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {

                add[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++)

                System.out.print(add[i][j] + " ");

            System.out.println();
        }
        // subtraction
        System.out.println("the subtraction is : ");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {

                sub[i][j] = mat1[i][j] - mat2[i][j];

            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++)

                System.out.print(sub[i][j] + " ");

            System.out.println();

        }
        // transpose
        System.out.println("the transpose of mat1 is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {

                trans[i][j] = mat1[j][i];

            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++)

                System.out.print(trans[i][j] + " ");

            System.out.println();

        }
        // multiply
        System.out.println("your multiplicsation of mat1 and mat2 : ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < rows; k++) {
                    mul[i][j] += mat1[i][k] * mat2[k][j];
                } // end of k loop
                System.out.print(mul[i][j] + " "); // printing matrix element
            } // end of j loop
            System.out.println();// new line
        }
    }
}
