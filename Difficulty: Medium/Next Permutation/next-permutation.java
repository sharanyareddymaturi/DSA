class Solution {
    public void reverse(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    void nextPermutation(int[] arr) {
        int pivot=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
              pivot=i;
              break;
            }
        }
        if(pivot==-1){
            reverse(arr,0,arr.length-1);
            return;
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        reverse(arr,pivot+1,arr.length-1);
    }
}