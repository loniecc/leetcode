
/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */
import java.util.*;

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        qucikSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int min = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (min + nums[left] + nums[right] == 0) {
                    result.add(Arrays.asList(min, nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (nums[left] + nums[right] + min < 0) {
                    left++;
                } else
                    right--;
            }

        }
        return result;
    }

    public void qucikSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int flag = nums[start];
        int left = start, right = end;
        while (left < right) {
            while (left < right && nums[right] > flag) {
                right--;
            }

            if (left < right) {
                nums[left++] = nums[right];
            }

            while (left < right && nums[left] < flag) {
                left++;
            }

            if (left < right) {
                nums[right--] = nums[left];
            }
        }
        nums[left] = flag;
        qucikSort(nums, start, left - 1);
        qucikSort(nums, left + 1, end);
    }

}
// @lc code=end
