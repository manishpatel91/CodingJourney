// We are given an unsorted array containing ‘n+1’ numbers taken from the range 1 to ‘n’. The array has only one duplicate but it can be repeated multiple times. Find that duplicate number without using any extra space. You are, however, allowed to modify the input array.
import java.util.*;


public class FindDuplicate {

public static int findNumber(int[] nums) {
    
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
     for(int i=0;i<nums.length;i++)
    {
         if (nums[i] != i + 1)
             return nums[i];
    }
    return -1;
  }

  public static void main(String[] args) 
  {
      System.out.println(findNumber(new int[] { 1, 4, 4, 3, 2 }));
      System.out.println(findNumber(new int[] {2, 4, 1, 4, 4  }));
  }
}
