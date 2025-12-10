class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        k=k%n;
        char res[]=new char[n];
        for(int i=0;i<n;i++){
            int j=(i+k)%n;
            res[i]=s.charAt(j);
        }
        return new String(res);
    }
}