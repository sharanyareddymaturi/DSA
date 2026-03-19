class Solution {
    public int maxDiff(int num) {
        String s=String.valueOf(num);
        return getMax(s)-getMin(s);
    }
    public int getMax(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c<'9'){
                return Integer.parseInt(s.replace(c+ "","9"));
            }
        }
        return Integer.parseInt(s);
    }
    public int getMin(String s){
        int n=s.length();
        char minValue=s.charAt(0);
        if(minValue!='1'){
            return Integer.parseInt(s.replace(minValue+"","1"));
        }
        else{
            for(int i=1;i<n;i++){
                char c=s.charAt(i);
                if(c!='0' && c!='1'){
                    return Integer.parseInt(s.replace(c+"","0"));
                }
            }
            return Integer.parseInt(s);
        }
    }
}


// class Solution {
//     public int maxDiff(int num) {
//         String str=Integer.toString(num);
//         StringBuilder maxstr=new StringBuilder(str);
//         StringBuilder minstr=new StringBuilder(str);

//         char maxDigit=' ';
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)!='9'){
//                 maxDigit=str.charAt(i);
//                 break;
//             }
//         }
//         if(maxDigit!=' '){
//             for(int i=0;i<maxstr.length();i++){
//                 if(str.charAt(i)==maxDigit){
//                     maxstr.setCharAt(i,'9');
//                 }
//             }
//         }
//         char minDigit=str.charAt(0);
//         char replace='1';
//         if(minDigit=='1'){
//             for(int i=1;i<str.length();i++){
//                 if(str.charAt(i)!='0' && str.charAt(i)!='1'){
//                     minDigit=str.charAt(i);
//                     replace='0';
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<minstr.length();i++){
//             if(minstr.charAt(i)==minDigit){
//                 minstr.setCharAt(i,replace);
//             }
//         }
//         int maxVal=Integer.parseInt(maxstr.toString());
//         int minVal=Integer.parseInt(minstr.toString());

//         return maxVal-minVal;
//     }
// }