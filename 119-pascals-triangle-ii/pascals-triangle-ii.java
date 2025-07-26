class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        
        for(int i=1;i<=rowIndex;i++){
            List<Integer> temp1=new ArrayList<>();
            temp1.add(1);
            for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                temp1.add(val);
            }
            
            
            temp1.add(1);
            ans.add(temp1);
        }
        return ans.get(rowIndex);
    }
}