class Solution {
    public int hammingWeight(int n) {
        int count=0;
        String bin="";
        while(n>0){
            int rem=n%2;
            bin=rem+bin;
            n=n/2;
        }
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}