// User function Template for Java

class Solution {
    int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : arr) {

            if (freq.containsKey(num - k)) {
                count += freq.get(num - k);
            }

            if (k != 0 && freq.containsKey(num + k)) {
                count += freq.get(num + k);
            }

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
