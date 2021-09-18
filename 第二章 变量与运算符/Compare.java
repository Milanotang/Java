package 第二章;
/*
比较三个数的最大值
 */
public class Compare {
    public static void main(String[] args){
        int a = 32;
        int b = 43;
        int c = 55;
        /*int max = 0;
        if(max < a){
            max = a;
        }
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println(max);*/
        int max1 = (a < b)?b:a;
        int max = (b < c)?c:b;
        System.out.println(max);
    }
}
