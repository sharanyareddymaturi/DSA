// class Solution {
//     public int romanToInt(String s) {
//         int ans = 0;
//     int[] roman = new int[128];

//     roman['I'] = 1;
//     roman['V'] = 5;
//     roman['X'] = 10;
//     roman['L'] = 50;
//     roman['C'] = 100;
//     roman['D'] = 500;
//     roman['M'] = 1000;

//     for (int i = 0; i + 1 < s.length(); ++i)
//       if (roman[s.charAt(i)] < roman[s.charAt(i + 1)])
//         ans -= roman[s.charAt(i)];
//       else
//         ans += roman[s.charAt(i)];

//     return ans + roman[s.charAt(s.length() - 1)];
//   }
// }

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int result=0;
        int prevValue=0;
        for(int i=s.length()-1;i>=0;i--){
            int currValue=hm.get(s.charAt(i));
            if(currValue<prevValue){
                result-=currValue;
            }else{
                result+=currValue;
            }
            prevValue=currValue;
        }
        return result;
    }
}
