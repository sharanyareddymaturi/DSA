class Solution {
    public boolean ispossible(int arr[], int threshold, int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int upper=arr[i]/k;
            if(arr[i]%k != 0){
                upper++;
            }
            threshold-=upper;
            if(threshold<0){
                return false;
            }
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=1000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(nums,threshold,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}