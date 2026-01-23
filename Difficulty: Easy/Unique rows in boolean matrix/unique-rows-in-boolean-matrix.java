/*Complete the given function*/
class GfG {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<r;i++){
            ArrayList<Integer> currentlist=new ArrayList<>();
            for(int j=0;j<c;j++){
                currentlist.add(a[i][j]);
            }
            if(!result.contains(currentlist)){
                result.add(currentlist);
            }
        }
        return result;
    }
}