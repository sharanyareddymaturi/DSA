class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }
        }
        ArrayList<Integer> al=new ArrayList<>(hs);
        return al;
    }
}
