// class Solution {
//     public boolean isPalindrome(int x) {
//        if(x<0){
//         return false;
//        }
//        int rev=0;
//        int original=x;
//        while(x>0){
//         int digit=x%10;
//         rev=(rev*10)+digit;
//         x=x/10;
//        }
//        return original==rev;
//     }
// }

// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x<0){
//             return false;
//         }
//         String str=Integer.toString(x);
//         String rev="";
//         for(int i=str.length()-1;i>=0;i--){
//             char ch=str.charAt(i);
//             rev=rev+ch;
//         }
//         return str.equals(rev);
//     }
// }

class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}