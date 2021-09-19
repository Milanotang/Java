package 嵌套循环;
/*
输出100以内的所有质数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        //1.遍历100以内的所有数；
        boolean isFlag = true;
        for (int i = 2; i <= 100; i++) {
            //2.只需要遍历该数一半或者开根号以内的因数即可；
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = true;
                    break;
                } else {
                    isFlag = false;
                }
            }
            //3.判断一个数是不是不是质数
            if (isFlag == false) {
                System.out.println(i + "是一个质数");
            }

        }
    }
}
