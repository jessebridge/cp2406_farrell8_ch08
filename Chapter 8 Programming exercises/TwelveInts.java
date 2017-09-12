import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TwelveInts {
    public static void main(String[] args) {
        Random number = new Random();
        Integer[] numberArray = new Integer[12];
        for (int i = 0; i <12;i++){
            int n = number.nextInt(100)+1;
            numberArray[i] = n;
        }
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));
        Arrays.sort(numberArray,Collections.reverseOrder());
        System.out.println(Arrays.toString(numberArray));
    }

}
