class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=-1;
        for(String token:s.split(" ")){
            if(Character.isDigit(token.charAt(0))){
                int cur=Integer.parseInt(token);
                if(cur<=prev){
                    return false;
                }
                prev=cur;
            }
        }
        return true;
    }
}