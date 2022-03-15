//We are given an array containing n distinct numbers taken from the range 0 to n. Since the array has only n numbers out of the total n+1 numbers, find the missing number.

public class MissingNumber {

  public static int findMissingNumber(int[] nums) {
    
    for(int i=0;i<nums.length;)
    {
        if(nums[i] >0 && nums[i]-1!=i)
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
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
            return i+1;
    }
    return nums.length;
  }

  public static void main(String[] args) 
  {
      System.out.println(MissingNumber.findMissingNumber(new int[] { 4, 0, 3, 1 }));
      System.out.println(MissingNumber.findMissingNumber(new int[] { 8, 3, 5, 2, 4, 6, 0, 1 }));
  }
}
