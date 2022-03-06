// Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’. Input: [2, 1, 3, 1, 5, 3, 8, 2], k=3 

public class Problem1 {
    public static int maxContArraySum(int arr[],int k)
    {
        int i=0,sum=0,n=arr.length,max=Integer.MIN_VALUE;
        while(i<n)
        {
            if(i>(k-1))
            {
                if(sum>max)
                    max=sum;
                sum-=arr[i-k];
            }
            sum+=arr[i];
            i++;
        }
        return max>sum?max:sum;
    }
    public static void main(String args[]) {
        
            int array[]={2, 1, 3, 1, 5, 3, 8, 10};
            int k=3;
            System.out.println("The maximum sum of contiguous subarray => "+(maxContArraySum(array,k)));
    }
}
