class Solution {
    public String finalString(String s) {
        StringBuilder res=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='i'){
                res.append(s.charAt(i));
            }else{
                res.reverse();
            }
        }
        return new String(res);
    }
}