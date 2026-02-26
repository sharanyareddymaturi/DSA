// User function Template for Java

class Solution {
    public int TotalPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=1;
        int count=0;
        while(j<n){
            int diff=nums[j]-nums[i];
            if(i==j || diff<k){
                j++;
            }
            else if(diff>k){
                i++;
            }else{
                count++;
                i++;
                j++;
                while(j<n && nums[j]==nums[j-1]){
                    j++;
                }
                while(i<n && i>0 && nums[i]==nums[i-1]){
                    i++;
                }
                
            }
        }
        return count;
    }
}