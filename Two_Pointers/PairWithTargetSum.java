//Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.

public class PairWithTargetSum {
    
    public static int[] search(int[] arr, int targetSum) {
        
        int a[]=new int[2];
        a[0]=-1;
        a[1]=-1;
        for(int i=0,j=arr.length-1;i<arr.length;)
        {
                if(arr[i]+arr[j]==targetSum)     
                    {
                        a[0]=i;
                        a[1]=j;
                        return a;
                    }
                else if(arr[i]+arr[j] > targetSum)
                        j--;
                else
                        i++;
                }
    return a;
  }
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 6};
        int target = 6;
        int output[] = search(a,target);
        System.out.println(output[0]+" "+output[1]);
    }
}
