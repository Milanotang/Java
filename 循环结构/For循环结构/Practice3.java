package For循环;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("在键盘上输入正整数m");
        int m = scan.nextInt();
        System.out.println("在键盘上输入正整数n");
        int n = scan.nextInt();
        /*for(i = m;i > 0;i--){
            if((m % i == 0) && ((n % i) == 0)){
                System.out.println("最大公约数为:" + i);
                break;
            }
        }
        int bei = m * n / i;
        System.out.println("最小公倍数:" + bei);*/

        //计算最大公约数
        int min = (m < n)? m : n;
        for(int i = min; i >= 1; i--){ //这里值得一提的是可以直接在for循环内定义一个变量保证其仅在该域内有效，避免了再去域外面声明变量的情况。
            if((m % i == 0) && (n % i == 0)){
                System.out.println("最大公约数为:" + i);
                break;
            }
        }

        //计算最小公倍数
        int max = (m > n)? m : n;
        for(int i = max; i <= m * n; i++){
            if((i % m == 0) && (i % n == 0)){
                System.out.println(i);
                break;
            }
        }
    }
}
