// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n<0){
//             return false;
//         }
//         for(int i=0;i<31;i++){
//             int ans=(int)Math.pow(2,i);
//             if(n==ans){
//                 return true;
//             }

//         }
//         return false;
//     }
// }

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
}
