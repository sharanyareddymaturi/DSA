class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int hi=(n*m)-1;
        while(low<=hi){
            int mid=low+(hi-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col]==x){
                return true;
            }
            else if(mat[row][col]<x){
                low=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return false;
    }
}







// class Solution {
//     public boolean searchMatrix(int[][] mat, int x) {
//         int n=mat.length;
//         int m=mat[0].length;
//         int i=0;
//         int j=m-1;
//         while(i<n && j>=0){
//             if(mat[i][j]==x){
//                 return true;
//             }
//             else if(mat[i][j]<x){
//                 i++;
//             }else{
//                 j--;
//             }
            
//         }
//         return false;
//     }
// }
// class Solution {
//     public boolean searchMatrix(int[][] mat, int x) {
//         int n=mat.length;
//         int m=mat[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(mat[i][j]==x){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
