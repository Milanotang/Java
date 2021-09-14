package for循环;
/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
为 0 时结束程序

说明：
1.不在循环条件部分限制次数的结构：for(;;) or while(true);
2.结束循环的方式：
方式一：循环条件部分返回false；
方式二：在循环体中执行break

 */
import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        System.out.println("请在键盘输入数字");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int num = scan.nextInt();
            if(num > 0){
                positiveNumber++;
            }else if(num < 0){
                negativeNumber++;
            }else{
                break;
            }
        }
        System.out.println(positiveNumber);
        System.out.println(negativeNumber);
    }
}
