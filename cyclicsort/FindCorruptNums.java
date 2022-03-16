// We are given an unsorted array containing ‘n’ numbers taken from the range 1 to ‘n’. The array originally contained all the numbers from 1 to ‘n’, but due to a data error, one of the numbers got duplicated which also resulted in one number going missing. Find both these numbers.

import java.util.*;


public class FindCorruptNums {

public static List<Integer> findNumbers(int[] nums) {
    
    for(int i=0;i<nums.length;)
    {
            if(nums[i]==nums[nums[i]-1])
            {
                i++;
            }
            else 
            {
                int sourceindex = i;
                int destindex = nums[i]-1;
                int temp = nums[sourceindex];
                nums[sourceindex] = nums[destindex];
                nums[destindex]=temp;
            }
    }
    List<Integer> l = new ArrayList<>();
    for (int i = 0; i < nums.length; i++)
      if (nums[i] != i + 1)
      {
          l.add(nums[i]);
          l.add(i+1);
        return l;
      }
 l.add(-1);
          l.add(-1);
    return l;
  }

  public static void main(String[] args) 
  {
      System.out.println(findNumbers(new int[] { 3, 1, 2, 5, 2 }));
      System.out.println(findNumbers(new int[] {3, 1, 2, 3, 6, 4}));
  }
}
