//Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.

public class Problem2 {
    public static int smallestSubArrayWithGreaterSum(int arr[],int s)
    {
        int n=arr.length,subarrayLength=0,sum=0,minsubarrayLength=Integer.MAX_VALUE;
        for(int i=0,j=0;i<arr.length;)
        {
            if(sum<s){
                sum+=arr[i++];
                subarrayLength++;
            }
            if(sum>=s)
            {
                if(minsubarrayLength>subarrayLength)
                    minsubarrayLength=subarrayLength;
                sum-=arr[j++];
                subarrayLength--;
                
            }
        }
        return minsubarrayLength;
    }
    public static void main(String args[]) 
    {
            int array[]={2, 1, 3, 1, 5, 3, 8, 10};
            int sum=9;
            System.out.println("The smallest contiguous subarray => "+(smallestSubArrayWithGreaterSum(array,sum)));
    }
}
