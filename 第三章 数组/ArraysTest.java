package 第三章数组;
import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] aargs){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{2,3,48,5};
        boolean isFlag = Arrays.equals(arr1 , arr2);
        System.out.println(isFlag);

        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int arr3[] = new int[]{1,2,4,6,8,9,10,66,8987};
        int index = Arrays.binarySearch(arr3,10);
        System.out.println(index);
    }
}
