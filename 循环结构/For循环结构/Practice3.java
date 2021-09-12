package For循环;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("在键盘上输入正整数m");
        int m = scan.nextInt();
        System.out.println("在键盘上输入正整数n");
        int n = scan.nextInt();
        int i; //定义一个约数
        for(i = m;i > 0;i--){
            if((m % i == 0) && ((n % i) == 0)){
                System.out.println("最大公约数为:" + i);
                break;
            }
        }
        int bei = m * n / i;
        System.out.println("最小公倍数:" + bei);
    }
}
