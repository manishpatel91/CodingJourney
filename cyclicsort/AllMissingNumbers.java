// We are given an unsorted array containing numbers taken from the range 1 to ‘n’. The array can have duplicates, which means some numbers will be missing. Find all those missing numbers.
import java.util.*;


public class AllMissingNumbers {


  public static List<Integer> findNumbers(int[] nums) {
    
    for(int i=0;i<nums.length;)
    {
        if(nums[i]!=nums[nums[i]-1])
        {
            int sourceindex = i;
            int destindex = nums[i]-1;
            int temp = nums[sourceindex];
            nums[sourceindex] = nums[destindex];
            nums[destindex]=temp;
        }
        else
        {
            i++;
        }
            
    }
    List<Integer> missingNumbers = new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
         if (nums[i] != i + 1)
        missingNumbers.add(i + 1);
    }
    return missingNumbers;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) 
  {
      System.out.println(findNumbers(new int[] { 2, 3, 1, 8, 2, 3, 5, 1 }));
      System.out.println(findNumbers(new int[] {2, 4, 1, 2  }));
  }
}
