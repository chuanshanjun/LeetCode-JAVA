// Given nums = [1,1,2],

// Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
// It doesn't matter what you leave beyond the new length.

// 原理就是两个指针一个指针负责不重复数组的长度，一个指针负责往前匹配数字，如果值相同第一个指针不动，另外一个指针继续往前找数字
// 如果值不同那么第一个指针往前移一位并且获取后一个指针目前所指的值.

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0 ) {
            return 0;
        }
        
        int len = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[len]) {
                nums[++len] = nums[i];
            }
        }
        
        return len + 1;
    }
}