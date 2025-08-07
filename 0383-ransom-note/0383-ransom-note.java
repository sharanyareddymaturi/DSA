// class Solution {
//       public void ascii(String a) {
//         System.out.print("ASCII of \"" + a + "\": ");
//         for (int i = 0; i < a.length(); i++) {
//             System.out.print((int) a.charAt(i) + " ");
//         }
//         System.out.println(); // for new line
//     }
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int i=0;
//         int j=0;
//         while(i<ransomNote.length() && j<magazine.length()){
//             if(ransomNote.charAt(i)==magazine.charAt(j)){
//                 i++;
//             }
//             j++;
//         }
//         return i==ransomNote.length();
//     }
// }

class Solution {
    public void ascii(String a) {
        System.out.print("ASCII of \"" + a + "\": ");
        for (int i = 0; i < a.length(); i++) {
            System.out.print((int) a.charAt(i) + " ");
        }
        System.out.println();
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26]; // For lowercase a-z

        // Count frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Subtract frequency for each character in ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false; // Not enough of this character
            }
            freq[c - 'a']--;
        }

        return true;
    }
}
