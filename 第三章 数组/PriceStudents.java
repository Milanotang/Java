package 第三章数组;
/*
从键盘读入学生成绩，找出最高分，
并输出学生成绩等级。
成绩 >= 最高分-10 等级为 ’A’
成绩 >= 最高分-20 等级为 ’B
成绩 >= 最高分-30 等级为 ’C’
其余 等级 为 D

提示：先读入学生人数，根据人数创建int 数组，存放学生成绩。
 */
import java.util.Scanner;
public class PriceStudents {
    public static void main(String[] args){
        //1.从键盘上读入学生的个数；
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生的人数");
        int num = scan.nextInt();
        //2.创建一个数组（动态初始化），将键盘上读入的数据存入数组中；
        int[] scores = new int[num];
        System.out.println("请输入学生的成绩");
        for(int i = 0;i < scores.length;i++){
            scores[i] = scan.nextInt();
        }
        //3.在数组中比较出最大值；
        int max = 0;
        /*for(int i = 0;i < scores.length - 1;i++){
            if (scores[i] < scores[i+1]){
                max = scores[i+1];
            }else{
                max = scores[i];
            }
        }*/
        for(int i = 0;i < scores.length;i++){
            if(max < scores[i]){
                max = scores[i];
            }
        }
        System.out.println("最高的成绩是" + max);
        //4.根据关系输出成绩和对应的等级
        for(int i = 0;i < scores.length;i++){
            /*if(scores[i] >= max - 10){
                System.out.println(scores[i] + "对应的等级是A");
            }else if(scores[i] >= max -20){
                System.out.println(scores[i] + "对应的成绩是B");
            }else if(scores[i] >= max - 30){
                System.out.println(scores[i] + "对应的成绩是C");
            }else{
                System.out.println(scores[i] + "对应的成绩是D");
            }*/
            char level;
            if(scores[i] >= max - 10){
                level = 'A';
            }else if(scores[i] >= max -20){
                level = 'B';
            }else if(scores[i] >= max - 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println(scores[i] + "grade is " + level);
        }
    }
}
