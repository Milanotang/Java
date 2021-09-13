package For循环;
/*
打印 1~100 之间所有是 7 的 倍数 的整数的 个数及总和 （体会设置计数
器的思想）
 */
public class Practice5 {
    public static void main(String[] args){
        int num = 0;
        int i;
        int sum = 0;
        for(i = 1;i <= 100;i++){
            if(i % 7 == 0){
                num++;
                sum += i;
            }
        }
        System.out.println("7的个数有" + num);
        System.out.println("总和是" + sum);
    }
}
