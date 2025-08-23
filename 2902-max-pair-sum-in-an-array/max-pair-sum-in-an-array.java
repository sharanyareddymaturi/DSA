class Solution {
    public int maxele(int n) {
        char[] ch = Integer.toString(n).toCharArray();
        int max = 0;
        for (int i = 0; i < ch.length; i++) {
            int digit = ch[i] - '0';
            if (digit > max) max = digit;
        }
        return max;
    }
    public int maxSum(int[] nums) {
        // for each digit 0..9 keep the largest and second-largest numbers having that max digit
        int[] first = new int[10];
        int[] second = new int[10];
        for (int i = 0; i < 10; i++) {
            first[i] = -1;
            second[i] = -1;
        }

        for (int x : nums) {
            int d = maxele(x);
            if (x >= first[d]) {
                second[d] = first[d];
                first[d] = x;
            } else if (x > second[d]) {
                second[d] = x;
            }
        }

        int ans = -1;
        for (int d = 0; d < 10; d++) {
            if (second[d] != -1) {
                ans = Math.max(ans, first[d] + second[d]);
            }
        }

        return ans;
    }
}
