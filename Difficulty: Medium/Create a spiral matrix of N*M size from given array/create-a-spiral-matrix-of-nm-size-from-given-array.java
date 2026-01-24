// User function Template for Java

class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        int l=0;
        int r=m-1;
        int t=0;
        int b=n-1;
        int matrix[][]=new int[n][m];
        int index=0;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                matrix[t][i]=arr[index++];
            }
            t++;
            for(int i=t;i<=b;i++){
                matrix[i][r]=arr[index++];
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    matrix[b][i]=arr[index++];
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    matrix[i][l]=arr[index++];
                }
                l++;
            }
        }
        return matrix;
        
    }
}
