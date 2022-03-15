// We are given an unsorted array containing n numbers taken from the range 1 to n. The array has some numbers appearing twice, find all these duplicate numbers using constant space.
import java.util.*;


public class FindDuplicateNumbers {

public static List<Integer> findNumbers(int[] nums) {
    
    for(int i=0;i<nums.length;)
    {
        if(nums[i]!=nums[nums[i]-1] )
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
    List<Integer> l = new ArrayList<>();
     for(int i=0;i<nums.length;i++)
    {
         if (nums[i] != i + 1 && !l.contains(nums[i]))
              l.add(nums[i]);
    }
    return l;
  }

  public static void main(String[] args) 
  {
      System.out.println(findNumbers(new int[] { 3, 4, 4, 5, 5 }));
      System.out.println(findNumbers(new int[] {5, 4, 7, 2, 3, 5, 3}));
  }
}
