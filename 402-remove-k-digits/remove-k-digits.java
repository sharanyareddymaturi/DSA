class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder str=new StringBuilder(num);
        int i=0;
        while(i<str.length()-1 && k>0){
            if(str.charAt(i)>str.charAt(i+1)){
                str.deleteCharAt(i);
                k--;
                if(i>0) i--;
            }else{
                i++;
            }
        }
        while(k>0){
            str.deleteCharAt(str.length()-1);
            k--;
        }
        while(str.length() > 1 && str.charAt(0)=='0'){
            str.deleteCharAt(0);
        }
        if(str.length()==0){
            return "0";
        }
        return str.toString();
    }
}