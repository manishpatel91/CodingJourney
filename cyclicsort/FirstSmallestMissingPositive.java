// Given an unsorted array containing numbers, find the smallest missing positive number in it.


import java.util.*;


public class FirstSmallestMissingPositive {

public static int findNumber(int[] nums) {
    
    int n = nums.length;
    for(int i=0;i<nums.length;)
    {

      if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1])
            
            {
                int sourceindex = i;
                int destindex = nums[i]-1;
                int temp = nums[sourceindex];
                nums[sourceindex] = nums[destindex];
                nums[destindex]=temp;
            }
            else 
                i++;
    }
    for (int i = 0; i < nums.length; i++)
      if (nums[i] != i + 1)
      {
        return i+1;
      }
    return -1;
  }

  public static void main(String[] args) 
  {
      System.out.println(findNumber(new int[] { 3, -2, 0, 1, 2 }));
      System.out.println(findNumber(new int[] {3, 2, 5, 1}));
  }
}
