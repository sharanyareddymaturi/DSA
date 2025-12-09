class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char c[]=new char[n];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            c[indices[i]]=ch;
        }
        sb.append(c);
        return sb.toString();
    }
}