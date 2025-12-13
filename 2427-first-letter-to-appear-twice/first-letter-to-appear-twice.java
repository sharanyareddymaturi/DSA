class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(hs.contains(ch)){
                return ch;
            }
            hs.add(ch);
        }
        return '0';
    }
}