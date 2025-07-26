class Solution {
    public boolean isvalid(int arr[][],int y,int x){
        int r=arr.length;
        int c=arr[0].length;
        int i=y;
        int j=x;
        int temp=arr[i][j];
        boolean valid=true;
        while(i<r && j<c){
            if(arr[i][j]!=temp){
                valid=false;
            }
            i++;
            j++;
        }
        return valid;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean ans=true;
        int r=matrix.length;
        int c=matrix[0].length;
        for(int j=0;j<c;j++){
            boolean temp=isvalid(matrix,0,j);
            if(temp==false){
                ans=false;
            }
        }
        for(int i=1;i<r;i++){
            boolean temp=isvalid(matrix,i,0);
            if(temp==false){
                ans=false;
            }
        }
        return ans;
    }
}