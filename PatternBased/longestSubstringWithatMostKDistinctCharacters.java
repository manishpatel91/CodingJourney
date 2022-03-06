// Given a string, find the  Longest Substring with at most 2 distinct characters

public class Problem4
{
    public static int longestSubstringWithatMostKDistinctCharacters(String s,int k)
    {
        StringBuilder temp = new StringBuilder("");
        int n=s.length(),clen=0,mlen=Integer.MIN_VALUE;
        int i=0,j=0;
        for(;i<n;i++)
        {
            if(temp.indexOf(s.charAt(i)+"") > -1 || clen<k)
            {
                    clen++;
                    temp.append(s.charAt(i)+"");
            }
            else
            {
                clen--;
                temp.deleteCharAt(j++);
            }
            System.out.println(i+" "+temp+" "+clen+" "+j );
        }
        return i-j;
    }
    public static void main(String args[]) 
    {
            String s="ABCAC";
            int k=2;
            System.out.println("The smallest contiguous subarray => "+(longestSubstringWithatMostKDistinctCharacters(s,k)));
    }
}
