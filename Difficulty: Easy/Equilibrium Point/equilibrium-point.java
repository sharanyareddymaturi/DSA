class Solution {
    public static int findEquilibrium(int arr[]) {
        int totalsum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        int leftsum=0;
        for(int i=0;i<n-1;i++){
            int rightsum=totalsum-leftsum-arr[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum=leftsum+arr[i];
        }
        return -1;
    }
}
