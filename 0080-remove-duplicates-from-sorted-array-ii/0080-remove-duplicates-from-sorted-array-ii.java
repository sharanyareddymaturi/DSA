class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = hm.getOrDefault(nums[i], 0);
            if (count < 2) {
                nums[k++] = nums[i];
                hm.put(nums[i], count + 1);
            }
        }
        return k;
    }
}