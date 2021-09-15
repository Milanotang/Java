package 循环;
/*
一个数如果恰好等于它的因子的和，这个数就称为“完数”。例如6=1+2+3。
编程：找出1000以内的所有完数（因数：除去这个数本身的其他约数）
 */
public class FinishCount {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i <= 1000;i++) {//找到1000以内的所有数
            for (int j = 1; j < i; j++) { //这里有个改进措施，只求i/2；
                // 原因是如果前一半不是约数，后一半必然不是约数
                if (i % j == 0) {//找到这个数的所有因数
                    sum += j;
                }
            }
            if(i == sum){
                System.out.println(i);
            }
        sum = 0;
        }
    }
}