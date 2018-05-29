/**
* 两个for循环为了减少重复 j的启始值为i+1
**/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}