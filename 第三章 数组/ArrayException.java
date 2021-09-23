package 第三章数组;

import java.util.Arrays;

/*
数组中常见的异常：
1. 数组角标越界的异常：ArrayIndexOutOfBoundsException

2. 空指针异常:NullPointerException
 */
public class ArrayException {
    public static void main(String[] args) {
        /*int[] arr = new int[]{12, 3, 4, 5, 6};
        for (int i = 0; i < 9; i++) {
            System.out.println(arr[i]);
        }*/

        //空指针异常：
        //情况一：
        int[] arr = new int[]{1,2,3};
        arr = null;//此处本来是有地址的，现在地址被擦掉了
        System.out.println(arr[2]);
        //情况二：
        /*int[][] arr2 = new int[4][];
        System.out.println(arr2[3]);//这种情况是有行的数组的，但是没有列，所以想当与没有对该数组进行赋值，其值是NN晒了、
        System.out.println(arr[2][3]);*/
        //情况三：
        String[] arr3 = new String[]{"AA","BB","CC"};
        System.out.println(arr3[0].toString());

    }
}
