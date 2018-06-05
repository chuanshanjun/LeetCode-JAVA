class Solution {
    public int singleNumber(int[] nums) {
  		/**
  		* 这个是自己写的原理就是:两个for循环 当基坐标相等的时候跳过
  		* 使用一个flag 当两个值相等的时候flag + 1 如果flag为0 则这个数没有重复 取出该值
  		**/
        int single = 0;
        for (int i = 0; i < nums.length; i ++) {
            int flag = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                
                if (nums[i] == nums[j]) {
                    flag++;
                }
            }
            
            if (0 == flag) {
                single = nums[i];
            }
            
        }
        
        return single;
        
        /**
        * 此为LeetCode上别人提交的代码可做参考
        * 使用异或^ 原理是 异或两次相同的值那么就相当于没有对值做任何处理
        **/
        int v = 0;
        for (int i = 0; i < nums.length; i++) {
            v ^= nums[i];
        }
        
        return v;
    }
}