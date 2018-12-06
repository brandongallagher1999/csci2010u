

import java.util.*;

public class a3q1{


  public static void subArrayMax(int[] array)
  {

    int max = 0;
    int sum = 0;
    int iterator = 0;
    int minIndex = 0;
    int highestIndex = 0;
    for (int i =0; i < array.length; i++){
      sum += array[i];

      if (max < sum){
        max = sum;
        minIndex = iterator;
        highestIndex = i;

      }

      if (sum < 0){
        sum = 0;
        iterator= i+ 1;     // O (n) time complexity
      }
    }
    System.out.print("[");
    for (int i = minIndex; i < highestIndex+1; i++){
      System.out.print(array[i]);
      if (!(i == highestIndex)){
        System.out.print(",");
      }
    }
    System.out.print("]");
    System.out.println("\nThe sum is: " + max);
  }

  public static void main(String[] args) {

    int[] array1 = {2, -4, 1, 9, -6, 7, -3};
    subArrayMax(array1);

  }


}
