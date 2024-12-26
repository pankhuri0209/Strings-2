public class problem1 {

    //Time Complexity: 0(n)
    // Space Complexity: 0(n)

    int[] lps;
    public int strStr(String haystack, String needle) {

        int m= haystack.length();
        int n= needle.length();
        this.lps = new int[n];

        int i=0,j=0;
        while (i<m)
        {
            if (haystack.charAt(i) == needle.charAt(j))
            {
                i++;j++;
                if (j==n)
                {
                    return i-j;
                }
            }
            else if (haystack.charAt(i) != needle.charAt(j) && j>0)
            {
                j=lps[j-1];
            }
            else {
                i++;
            }
        }
        return -1;

    }
    private void   lpsCals(String needle) {
        lps[0] = 0;
        int i = 1, j = 0;
        while (i < needle.length())
        {
            if (needle.charAt(i) == needle.charAt(j))
            {
                j++; lps[i]=j; i++;
            } else if (needle.charAt(i) != needle.charAt(j) && j>0) {
                j=lps[j-1];

            }
            else {
                lps[i]=0;
                i++;
            }
        }
        return;


    }
}
