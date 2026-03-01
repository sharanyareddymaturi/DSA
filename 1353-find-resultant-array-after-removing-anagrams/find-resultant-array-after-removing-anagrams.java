class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<HashMap<Character,Integer>> list=new ArrayList<>();
        for(String w:words){
            HashMap<Character,Integer> hm=new HashMap<>();
            for(char c:w.toCharArray()){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
            list.add(hm);
        }
        ArrayList<String> res=new ArrayList<>();
        res.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!list.get(i).equals(list.get(i-1))){
                res.add(words[i]);
            }
        }
        return res;

    }
}