public class Do_while_Test {
    public static void main(String[] args){
        //遍历100以内的偶数
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }while(i < 100);
    }
}
