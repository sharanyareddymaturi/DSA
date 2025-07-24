// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         List<Integer> l1 =new ArrayList<>();
//         List<Integer> l2 =new ArrayList<>();
//         for(char c: s.toCharArray()){
//             l1.add(s.indexOf(c));
//         }
//         for(char c: t.toCharArray()){
//             l2.add(t.indexOf(c));
//         }
//         return l1.equals(l2);
//     }
// }

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>hm=new HashMap<>();
        HashMap<Character,Character>rev=new HashMap<>();
        boolean ans=true;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(!hm.containsKey(ch1) && !rev.containsKey(ch2)){
                hm.put(ch1,ch2);
                rev.put(ch2,ch1);
            }else if(hm.containsKey(ch1) && hm.get(ch1)!=ch2){
                ans=false;
                break;
            }else if(rev.containsKey(ch2) && rev.get(ch2)!=ch1){
                ans=false;
                break;
            }
        }
        return ans;
    }
}