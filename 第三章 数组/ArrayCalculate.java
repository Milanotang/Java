package 第三章数组;
/*
定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，和以及平均值，并输出出来 。
要求：所有随机数都是两位数。
 */
public class ArrayCalculate {
    public static void main(String[] args){
        int[] arr = new int[10];
        int i = 0;
        for(i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * 90 + 10);//求随机数的方法，一定不能省略括号的存在，否则前面取整的部分就先进行运算了
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int max = arr[0]; //保险起见，如果数组里有负数，则最大值就变成了0，所以需要选用数组里的元素作为最大值进行比较。
        int min = 0;
        int sum = 0;
        int value = 0;
        for(i = 0;i < arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            sum += arr[i];
            value = sum / arr.length;
        }
        System.out.println("最大值是" + max);
        System.out.println("最小值是" + min);
        System.out.println("总和是" + sum);
        System.out.println("平均值是" + value);
    }
}
