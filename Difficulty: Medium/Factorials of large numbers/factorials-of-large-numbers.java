// User function Template for Java

import java.util.*;
import java.math.BigInteger;

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        if (n < 0) return digits;           
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String s = fact.toString();         
        for (int i = 0; i < s.length(); i++) {
            digits.add(s.charAt(i) - '0');  
        }
        return digits;
    }
}
