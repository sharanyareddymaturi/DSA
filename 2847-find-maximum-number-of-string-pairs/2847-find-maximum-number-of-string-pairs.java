class Solution {
    public String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int n=words.length;
        int ans=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String a=words[i];
                String b=words[j];
                String revb=reverse(b);
                if(revb.equals(a)){
                    ans++;

                }
            }
        }
        return ans;
        
    }
}

// class Solution {
//     public int maximumNumberOfStringPairs(String[] words) {
//         int n=words.length;
//         int count=0;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 char ch1=words[i].charAt(0);
//                 char ch2=words[i].charAt(1);
//                 if(ch1==words[j].charAt(1) && ch2==words[j].charAt(0)){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }