class Solution {
    public int getSecondLargest(int[] arr) {
        int max=-1;
        int secmax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }else if(arr[i]>secmax && arr[i]<max){
                secmax=arr[i];
            }
        }
        return secmax;
    }
}