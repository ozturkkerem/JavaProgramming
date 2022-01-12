package day22_MultiDimensionArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));


        for (int[][] each2D : arr3D) {

            for (int[] each1D : each2D) {
                for (int element : each1D) {
                    System.out.print(element + " ");


                    int[][][][] ar4D = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}}};

                    for (int[][][] each3D : ar4D) {
                        for (int[][] each2D_ : each3D) {
                            for (int[] each1D_ : each2D_) {
                                for (int eleme : each1D_) {
                                    System.out.print(eleme + " ");
                                }
                            }
                        }

                    }


                }
            }
        }
    }
}
