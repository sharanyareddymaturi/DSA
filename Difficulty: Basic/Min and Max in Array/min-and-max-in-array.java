class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        res.add(min);
        res.add(max);
       return res; 
    }
}
