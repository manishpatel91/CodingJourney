/* In a non-empty array of integers, every number appears twice except for one, find that single number. */
public class SingleNumber {
  public static int findSingleNumber(int[] arr) {
        int x=arr[0];
       for(int i=1;i<arr.length;i++)
       {
           x^=arr[i];
       }
       return x;
  }
  public static void main( String args[] ) {
    System.out.println(findSingleNumber(new int[]{1, 4, 2, 1, 3, 2, 3}));
  }
}
