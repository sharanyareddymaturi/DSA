class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<=n){
                visited[arr[i]-1]=true;
            }
        }
            for(int i=0;i<n;i++){
                if(visited[i]==false){
                    return i+1;
                }
            }
            
        return n+1;
    }
}