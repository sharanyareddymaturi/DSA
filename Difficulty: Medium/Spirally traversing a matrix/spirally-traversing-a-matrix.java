class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int l=0;
        int r=col-1;
        int t=0;
        int b=row-1;
        ArrayList<Integer>res=new ArrayList<>();
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                res.add(mat[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                res.add(mat[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    res.add(mat[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    res.add(mat[i][l]);
                }
                l++;
            }
        }
        return res;
        
    }
}
