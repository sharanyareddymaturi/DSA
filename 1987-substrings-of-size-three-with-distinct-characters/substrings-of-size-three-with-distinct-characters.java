class Solution {
    public boolean fun(String s,int k){
        int n=s.length();
        HashSet<Character> hp=new HashSet<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hp.add(ch);
        }
        if(hp.size()==k){
            return true;
            }
            else{
                return false;
                }
    }
    public int countGoodSubstrings(String s){
        int ans=0;
        int n=s.length();
        int k=3;
        for(int i=0;i<n-k+1;i++){
            boolean temp=fun(s.substring(i,i+k),k);
            if(temp){
                ans+=1;
            }
        }
        return ans;
    }

}