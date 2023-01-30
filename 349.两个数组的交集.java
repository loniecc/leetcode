/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 *
 * https://leetcode.cn/problems/intersection-of-two-arrays/description/
 *
 * algorithms
 * Easy (74.31%)
 * Likes:    706
 * Dislikes: 0
 * Total Accepted:    393K
 * Total Submissions: 528.9K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 解释：[4,9] 也是可通过的
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // array1 put in hash map
        // loop array2， if contains in map，add to result array
        if(null == nums1 || nums1.length == 0){
            return nums2;
        }
        if(null == nums2 || nums2.length == 0){
            return nums1;
        }
        Set<Integer> mapping = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int i=0; i< nums1.length; i++){
            mapping.add(nums1[i]);
        }

        for(int i=0; i< nums2.length; i++){
            if(mapping.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }
}
// @lc code=end

