class Solution {
    public int reverseBits(int n) {
        String bin="";

        for(int i=0;i<32;i++){
            bin=bin+(n&1);
            n>>>=1;
        }
        long num=Long.parseLong(bin,2);
        return (int)num;
    }
}

// class Solution {
//     public int reverseBits(int n) {
//         String bin = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

//         String rev="";
//         for(int i=bin.length()-1;i>=0;i--){
//             rev=rev+bin.charAt(i);
//         }
//         long dec=Long.parseLong(rev,2);
//         return (int)dec;
//     }
// }