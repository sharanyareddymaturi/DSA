class Solution {
    public boolean isprime(int nums){
        if(nums<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(nums);i++){
            if(nums%i==0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int r=nums.length;
        int c=nums[0].length;
        int max=0;

        for(int i=0;i<Math.min(r,c);i++){
            int value1=nums[i][i];
            if(isprime(value1)){
                if(value1>max){
                    max=value1;
                }
            }
            int value2=nums[i][c-1-i];
            if(i!=c-1-i && isprime(value2)){
                max=Math.max(max,value2);
            }
        }
        return max;
    }
}


