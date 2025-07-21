// class Solution {
//     public String addBinary(String a, String b) {
//         StringBuilder sb=new StringBuilder();
//         int carry=0;
//         int i=a.length()-1;
//         int j=b.length()-1;
//         while(i>=0||j>=0||carry==1){
//             int sum=carry;
//             if(i>=0){
//                 sum=sum+a.charAt(i)-'0';
//                 i--;
//             }
//             if(j>=0){
//                 sum=sum+b.charAt(j)-'0';
//                 j--;
//             }
//             sb.append(sum%2);
//             carry=sum/2;
//         }
//         return sb.reverse().toString();
//     }
// }

class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length();
        int n2=b.length();
        int max=Math.max(n1,n2);
        for(int i=0;i<max-n1;i++){
            a='0'+a;
        }
        for(int i=0;i<max-n2;i++){
            b='0'+b;
        }
        int carry=0;
        StringBuilder sb1=new StringBuilder(a);
        StringBuilder sb2=new StringBuilder(b);
        StringBuilder ans=new StringBuilder();
        for(int i=max-1;i>=0;i--){
            int ch1=sb1.charAt(i)-'0';
            int ch2=sb2.charAt(i)-'0';
            int sum=ch1+ch2+carry;
            if(sum==0){
                ans.append('0');
                carry=0;
            }
            else if(sum==1){
                ans.append('1');
                carry=0;
            }
            else if(sum==2){
                ans.append('0');
                carry=1;
            }
            else{
                ans.append('1');
                carry=1;
            }
        }
        if(carry!=0){
            ans.append(carry);
        }        
        return ans.reverse().toString();
    }
}