class Solution {
    public boolean isVowel(char c){
        return c=='a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        char words[]=s.toCharArray();
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right){
            while(left<right && !isVowel(words[left])){
                left++;
            }
            while(left<right && !isVowel(words[right])){
                right--;
            }
                char temp=words[left];
                words[left]=words[right];
                words[right]=temp;
                left++;
                right--;
        }
        String ans=new String(words);
        return ans;
    }
}