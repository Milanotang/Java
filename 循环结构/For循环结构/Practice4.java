package For循环;
/*
求1-100以内所有奇数的和
 */
public class Practice4 {
    public static void main(String[] args){
        int i;
        int sum = 0;
        for(i = 1;i <= 100;i++ ){
            if(i % 2 ==1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
