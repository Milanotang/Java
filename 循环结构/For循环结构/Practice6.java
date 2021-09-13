package For循环;
/*
输出所有的水仙花数，所谓水仙花数是指一个3位数 ，其各个位上数
字立方和等于其本身。

重点：怎么求一个数各个位数的数字？
 */
public class Practice6 {
    public static void main(String[] args) {
        int i;
        for (i = 100; i <= 999;i++) {
            int num3 = i / 100;//求百位；
            int num2 = (i % 100) / 10;//求十位；
            int num = i % 100 % 10;//求个位
            if (i == num3 * num3 * num3 + num2 * num2 * num2 + num * num * num) {
                System.out.println(i);
            }
        }
    }
}
