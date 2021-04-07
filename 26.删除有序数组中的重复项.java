/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int ps = 0, pf = 0;
        int tmp;
        while(pf < nums.length){
            if(nums[pf] > nums[ps]){
                if(pf - ps > 1){
                    tmp = nums[pf];
                    nums[pf] = nums[ps+1];
                    nums[ps+1] = tmp;
                }
                ps ++;
            }
            pf ++;
        }
        return ps + 1;
    }

}
// @lc code=end

