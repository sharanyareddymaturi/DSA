// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.addAll(hs);
        return res;
    }
}