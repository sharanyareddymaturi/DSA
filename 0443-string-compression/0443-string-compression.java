class Solution {
    public int compress(char[] chars) {
        int indx=0;
        int n=chars.length;
        int i=0;

        while(i<n){
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                chars[indx]=ch;
                indx++;
            }else{
                chars[indx]=ch;
                indx++;
                String str=Integer.toString(count);
                for(int j=0;j<str.length();j++){
                    chars[indx]=str.charAt(j);
                    indx++;
                }
            }
        }
        return indx;
    }
 }


// class Solution {
//     public String compressNonConsecutive(char[] chars) {
//         // Count frequencies
//         HashMap<Character, Integer> freq = new LinkedHashMap<>(); 
//         // LinkedHashMap to preserve the order of *first appearance*
//         for (char c : chars) {
//             freq.put(c, freq.getOrDefault(c, 0) + 1);
//         }

//         // Build compressed string
//         StringBuilder sb = new StringBuilder();
//         for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
//             sb.append(entry.getKey());
//             if (entry.getValue() > 1) {
//                 sb.append(entry.getValue());
//             }
//         }

//         return sb.toString();
//     }
// }
