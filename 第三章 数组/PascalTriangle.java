package 第三章数组;

public class PascalTriangle {
    public static void main(String[] args) {
        //1.创建并初始化一个二维数组
        int[][] arr = new int[10][];//二维数组的列是不固定的，所以一定不能初始化
        //2.给这个二维数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            //3.遍历这个二维数组
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 | j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}