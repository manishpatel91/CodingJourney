// Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.

public class SortedArraySquares {

  public static int[] makeSquares(int[] a) {
    int[] squares = new int[a.length];
    
    for(int i=0,j=a.length-1;j>0;j--)
    {
        if(a[j]*a[j] < a[i]*a[i])
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        squares[j]=a[j]*a[j];
    }
    
    return squares;
  }
    public static void main(String args[]) {
        int a[] = {-1,-1,0,1,2,3};
        for(int v:makeSquares(a))
            System.out.println(v+" ");
    }
}
