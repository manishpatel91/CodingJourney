// Given a string, find the length of the longest substring, which has all distinct characters.


public class Problem4
{
    public static int longestSubstringWithAllDistinctCharacters(String s,int k)
    {
        StringBuilder temp = new StringBuilder("");
        int n=s.length(),mlen=Integer.MIN_VALUE;
        int i=0,j=0;
        for(;i<n;)
        {
            if(temp.indexOf(s.charAt(i)+"") > -1 && j>=0)
            {
                    temp.deleteCharAt(j);
            }
            else
            {
                temp.append(s.charAt(i++)+"");
            }
            if(mlen<temp.length())
                mlen=temp.length();
        }
        return mlen;
    }
    public static void main(String args[]) 
    {
            String s="ABBBABBCC";
            int k=2;
            System.out.println("The smallest contiguous subarray => "+(longestSubstringWithAllDistinctCharacters(s,k)));
    }
}
