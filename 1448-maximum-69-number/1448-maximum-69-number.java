// class Solution {
//     public int maximum69Number (int num) {
//         while(num!=0){
//             int temp=num%10;
//             if(temp==6){
//                 temp=9;
//                 break;
//             }
//             num/=num;
//         }
//     }
// }

class Solution {
    public int maximum69Number (int num) {
        char digits[]=String.valueOf(num).toCharArray();
        for(int i=0;i<digits.length;i++){
            if(digits[i]=='6'){
                digits[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));

    }
}