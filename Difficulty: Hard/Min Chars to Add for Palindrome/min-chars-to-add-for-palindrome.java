class Solution {

    public int[] computeLps(String str) {
        int n = str.length();
        int[] lps = new int[n];

        int len = 0;   
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

  
    // public String reverse(String s) {
    //     String rev = "";
    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         rev = rev + s.charAt(i);
    //     }
    //     return rev;
    // }

    public int minChar(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = computeLps(combined);

        return s.length() - lps[combined.length() - 1];
    }
}
