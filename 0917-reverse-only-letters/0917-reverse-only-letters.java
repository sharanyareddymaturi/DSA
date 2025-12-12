class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right){
            if(!Character.isLetter(ch[left])){
                left++;
            }else if(!Character.isLetter(ch[right])){
                right--;
            }else{
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}


// class Solution {
//     public String reverseOnlyLetters(String s) {
//         int n=s.length();
//         StringBuilder sb=new StringBuilder(s);
//         for(int i=0,j=n-1;i<j;){
//             if(!Character.isLetter(sb.charAt(i))){
//                 i++;
//             }
//             else if(!Character.isLetter(sb.charAt(j))){
//                 j--;
//             }else{
//                 sb.setCharAt(i,s.charAt(j));
//                 sb.setCharAt(j--,s.charAt(i++));
//             }
//         }
//         return new String(sb);
//     }
// }