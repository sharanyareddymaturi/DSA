class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0;i<nums1.length && j<n;i++){
            if(nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}


// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for(int i=0;i<n;i++){
//             nums1[i+m]=nums2[i];
//         }
//         Arrays.sort(nums1);
//     }
// }

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m - 1;
//         int j = n - 1;
//         int k = m + n - 1;
        
//         while (j >= 0) {
//             if (i >= 0 && nums1[i] > nums2[j]) {
//                 nums1[k--] = nums1[i--];
//             } else {
//                 nums1[k--] = nums2[j--];
//             }
//         }
//     }
// }