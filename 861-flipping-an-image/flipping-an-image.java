class Solution {
    public void reverse(int arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int temp=arr[l]^1;
            arr[l]=arr[r]^1;
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int arr[]:image){
            reverse(arr);
        }
        return image;
    }
}