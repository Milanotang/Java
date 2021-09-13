package for循环;
/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
为 0 时结束程序
 */
import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {
        int positiveNumber = 0;
        int negtiveNumber = 0;
        System.out.println("请输入数字");
        Scanner scan = new Scanner(System.in);//scan对象，一个可以解决，不用放在循环体内
        while (true) {  //改用for(;;)也可以
            int num = scan.nextInt();
            if(num > 0){
                positiveNumber++;
            }else if(num < 0){
                negtiveNumber++;
            }else{
                break;
            }
        }
        System.out.println("正数的个数是：" + positiveNumber);
        System.out.println("负数的个数是：" + negtiveNumber);
    }
}
