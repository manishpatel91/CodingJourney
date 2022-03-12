//Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the length of the subarray that has no duplicate in it.

public class RemoveDuplicates {
    
    public static int remove(int[] arr) {
    
        int i=0,j=i+1;
        for(;j<arr.length;)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
                j++;
            }
            else
                j++;
        }
        return i+1;
  }
    public static void main(String args[]) {
        int a[] = {2,3,3,4,4,4,4,5,6,7,7};
        System.out.println(remove(a));
    }
}
