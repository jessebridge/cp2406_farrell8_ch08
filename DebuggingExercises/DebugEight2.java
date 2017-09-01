import java.lang.reflect.Array;

// Sum and average an array of integers
public class DebugEight2
{
   public static void main(String args[])
   {
      int[] someNums = {4, 17, 22, 8, 35};
      int someNumslength = Array.getLength(someNums);
      int tot = 0;
      int x;
      for(x = 0; x < someNumslength; ++x)
        tot = someNums[someNumslength];
      System.out.println("Sum is  tot");
      System.out.println("Average is " + tot);
   }
}
