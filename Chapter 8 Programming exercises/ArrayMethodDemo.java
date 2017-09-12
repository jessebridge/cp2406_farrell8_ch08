import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Random number = new Random();
        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++) {
            int n = number.nextInt(100)+1;
            array[i] = n;
        }
        arrayPrint(array);
        reverseArray(array);
        int sum = sumOfArray(array);
        numbersBelow(array);
        System.out.println("\n");
        numbersAbove(array,sum);
    }

    private static void numbersAbove(Integer[] array,int sum) {
        int average = sum/array.length;
        System.out.println("average " + average);
        for(int i = 0; i<array.length;i++){
            if(array[i] > average){
                System.out.println(array[i]);
            }
        }
    }

    private static void numbersBelow(Integer[] array) {
        int belownum = 30;
        for(int i = 0; i<array.length;i++){
            if(array[i] < belownum){
                System.out.println(array[i]);
            }
        }
    }

    private static int sumOfArray(Integer[] array) {
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
        return sum;
    }

    private static void reverseArray(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

    private static void arrayPrint(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }
}
