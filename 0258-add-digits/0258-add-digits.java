// class Solution {
//     public int addDigits(int num) {
//         while(num>=10){
//             int sum=0;
//             while(num!=0){
//                 int digit=num%10;
//                 sum=sum+digit;
//                 num=num/10;
//             }
//             num=sum;
//         }
//         return num;
//     }
// }

class Solution {
    public int addDigits(int num) {
        while(num>=10){
            String str=Integer.toString(num);
            int sum=0;
            for(int i=0;i<str.length();i++){
                sum=sum+(str.charAt(i)-'0');
            }
            num=sum;
        }
        return num;
    }
}