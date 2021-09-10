package For循环;
/*
编写:
程序从 1 循环 到 150 ，并在每行打印一个值，另外在每个 3 的倍数行
上打印出“ foo 在每个 5 的倍数行上打印“ biz”, 在每个 7 的倍数行上打印
输出“ baz 。
 */
public class Practice2 {
    public static void main(String[] args){
        int num;
        for(num = 1;num <= 150;num++){
            System.out.print(num + " ");
            if(num % 3 == 0){
                System.out.print("foo ");
            }
            if(num % 5 == 0){
                System.out.print("biz ");
            }
            if(num % 7 == 0){
                System.out.print("baz ");
            }
            System.out.println();
        }
    }
}
