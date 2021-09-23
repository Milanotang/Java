package 第三章数组;
/*
算法的考察：数组的复制、翻转、查找（线性查找、二分法查找）
 */
public class ArrayEtc {
    public static void main(String[] args){
        //String[] str = new String[]{"AA","BB","CC","DD"};
        //1. 数组的复制：
        /*String[] str2 = new String[str.length];
        for(int i = 0;i < str2.length;i++){
            str2[i] = str[i];
            System.out.println(str[i]);
        }*/

        //2. 数组的翻转:方法一
        /*for(int i = 0;i < str.length / 2;i++){//也可以使用双指针的方法完成这一步；也可以另开一个数组倒着遍历
            String temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = temp;
        }
        for(int i = 0;i < str.length;i++){
            System.out.println(str[i]);
        }*/

        //3. 数组的查找
        //线性查找：int型的用 == 进行判断；String类型的用equals方法进行判断
        /*boolean isFlag = true;
        String test = "FF";
        for(int i = 0;i < str.length;i++){
            if(test.equals(str[i])){
                System.out.println("找到了指定的元素，位置是：" + i);
                break;//找到了以后就不用再找了
            }else{
                isFlag = false;
            }
        }
        if(isFlag == false){
            System.out.println("很遗憾哦没有找到");//不能在循环里面写，这里的思想和质数一样，都需要遍历完再进行输出
        }*/

        //二分法查找：
        //前提：所要查找的数组必须有序，在有序的前提下进行查找
        int[] arr = new int[]{-3,-2,1,7,10,225,407};
        int test = 225;
        int head = 0;
        int end = arr.length - 1;
        boolean isFlag = true;
        while (true){
            int middle = (head + end) / 2;
            if(test == arr[middle]){
                System.out.println("找到了，索引是：" + middle);
                break;
            }else if(test < arr[middle]){
                end = middle - 1;
            }else if(test > arr[middle]){
                head = middle + 1;
            }else{
                isFlag = false;
            }
        }
        if(isFlag = false){
            System.out.println("很遗憾，没有找到你要查找的元素");
        }
    }
}