/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        quickSort(nums,0,nums.length-1);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void quickSort(int[] nums,int start, int end){
     
        if(start >= end){
            return;
        }
        int left = start ,right = end;
        int flag = nums[left];

        while(left < right){
            while(left < right && nums[right] > flag){
                right--;
            }

            if( left < right){
                nums[left++] = nums[right];
            }

            while(left < right && nums[left] < flag){
                left ++;
            }

            if(left < right){
                nums[right--] = nums[left];
            }

        }
        nums[left] = flag;
        quickSort(nums,start,left-1);
        quickSort(nums,left+1,end);
    }
}

// @lc code=end

