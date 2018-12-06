import java.util.*;



public class a3q2{

  public static String majority(int[] array)
  {
    int n = array.length;
    int counter = 1;

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < n; i++){
      if (map.containsKey(array[i])){
        counter = map.get(array[i]);
        map.put(array[i], counter + 1);
      }
      else{
        map.put(array[i], 1);
      }
    }

    for (int i = 0; i < n; i++){
      if (map.get(array[i]) >= (n/2)){
        Integer temp  = new Integer(array[i]);
        return temp.toString();
      }
    }
    return "null";
  }

  public static void main(String[] args)
  {
    int[] array = {1,1,1,9,9};
    System.out.println("Majority is: " + majority(array));

    int[] array2 = {1,2,3,4,5};
    System.out.println("Majority is: " + majority(array2));
  }




}
