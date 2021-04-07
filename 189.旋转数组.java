/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1){
            return ;
        }
        int realK = k % nums.length;
        //1. 全部翻转    
        reverseArray(nums,0,nums.length);
        //2. 翻转前半部分
        reverseArray(nums,0,realK);
        //3. 翻转后半部分
        reverseArray(nums,realK,nums.length);
    }

    public void reverseArray(int[] array, int start , int end){
        for(int i=0;i<(end-start)/2;i++){
            int tmp = array[start+i];
            array[start+i] = array[end-1-i];
            array[end-1-i] = tmp;
        }
    }

}
// @lc code=end

