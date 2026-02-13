

class Solution {
    public boolean searchRowMatrix(int[][] mat, int x) {
        for(int i=0;i<mat.length;i++){
            int arr[]=mat[i];
            if(binary(arr,x)){
                return true;
            }
        }
        return false;
    }
    public boolean binary(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return true;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
        
    }
}
