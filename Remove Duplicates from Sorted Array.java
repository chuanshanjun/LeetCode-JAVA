// Given nums = [1,1,2],

// Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
// It doesn't matter what you leave beyond the new length.

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0 ) {
            return 0;
        }
        
        int len = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[len]) {
                nums[++len] = nums[i];
            }
        }
        
        return len + 1;
    }
}