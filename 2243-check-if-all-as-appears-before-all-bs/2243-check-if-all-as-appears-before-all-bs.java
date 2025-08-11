// class Solution {
//     public boolean checkString(String s) {
//         char ch[]=s.toCharArray();
//         for(int i=1;i<ch.length;i++){
//             if(ch[i-1]=='b' && ch[i]=='a'){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean checkString(String s) {
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)=='b' && s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}