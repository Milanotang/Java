/*
遍历100以内的所有偶数并打印,
 */
public class Traverse {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
