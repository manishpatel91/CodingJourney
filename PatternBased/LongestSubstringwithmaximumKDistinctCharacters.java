// Given a string, find the length of the longest substring in it with no more than K distinct characters

public class Problem3 
{
    public static int longestSubstringWithNoMoreThanKDistinctCharacters(String s,int k)
    {
        StringBuilder temp = new StringBuilder("");
        int n=s.length(),clen=0,mlen=Integer.MIN_VALUE;
        for(int i=0,j=0;i<n;i++)
        {
            if(temp.indexOf(s.charAt(i)+"") > -1 || clen<=k)
            {
                    clen++;
                    temp.append(s.charAt(i)+"");
            }
            else
                temp.deleteCharAt(j++);

            if(mlen<clen)
                    mlen=clen;
                    
            //System.out.println(i+" "+temp+" "+clen+" "+mlen);
        }
        return mlen;
    }
    public static void main(String args[]) 
    {
            String s="araaci";
            int k=2;
            System.out.println("The smallest contiguous subarray => "+(longestSubstringWithNoMoreThanKDistinctCharacters(s,k)));
    }
}
