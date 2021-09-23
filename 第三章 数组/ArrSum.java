package 第三章数组;

public class ArrSum {
    public static void main(String[] args){
        /*
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
         */
        //也可以换一种赋值的方式：
        int[][] arr = new int[3][];
        arr[0] = new int[]{3,5,8};
        arr[1] = new int[]{12,9};
        arr[2] = new int[]{7,0,6,4};
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("数组中元素的和是:" + sum);
    }
}
