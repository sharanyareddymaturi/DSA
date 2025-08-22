class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        if (nums.length > 0) {
            int start = nums[0];
            int prev = nums[0];

            for (int i = 1; i < nums.length; i++) {         
                if (nums[i] == prev + 1) {
                    prev = nums[i];                         
                } else {
                    if (start == prev) {
                        ranges.add(String.valueOf(start));
                    } else {
                        ranges.add(start + "->" + prev);
                    }
                    start = nums[i];
                    prev = nums[i];
                }
            }
            if (start == prev) {
                ranges.add(String.valueOf(start));
            } else {
                ranges.add(start + "->" + prev);
            }
        }

        return(ranges); 
    }
}
