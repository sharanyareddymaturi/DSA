class Solution {
    public int maxDiff(int num) {
        String str=Integer.toString(num);
        StringBuilder maxstr=new StringBuilder(str);
        StringBuilder minstr=new StringBuilder(str);

        char maxDigit=' ';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='9'){
                maxDigit=str.charAt(i);
                break;
            }
        }
        if(maxDigit!=' '){
            for(int i=0;i<maxstr.length();i++){
                if(str.charAt(i)==maxDigit){
                    maxstr.setCharAt(i,'9');
                }
            }
        }
        char minDigit=str.charAt(0);
        char replace='1';
        if(minDigit=='1'){
            for(int i=1;i<str.length();i++){
                if(str.charAt(i)!='0' && str.charAt(i)!='1'){
                    minDigit=str.charAt(i);
                    replace='0';
                    break;
                }
            }
        }
        for(int i=0;i<minstr.length();i++){
            if(minstr.charAt(i)==minDigit){
                minstr.setCharAt(i,replace);
            }
        }
        int maxVal=Integer.parseInt(maxstr.toString());
        int minVal=Integer.parseInt(minstr.toString());

        return maxVal-minVal;
    }
}