class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0,j=n-1;i<j;){
            if(!Character.isLetter(sb.charAt(i))){
                i++;
            }
            else if(!Character.isLetter(sb.charAt(j))){
                j--;
            }else{
                sb.setCharAt(i,s.charAt(j));
                sb.setCharAt(j--,s.charAt(i++));
            }
        }
        return new String(sb);
    }
}