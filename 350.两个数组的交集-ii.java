import java.util.*;
/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */
// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer,Integer> count1 = count(nums1);
       Map<Integer,Integer> count2 = count(nums2);
    
       List<Integer> common = new ArrayList();
        
       for(Integer key : count1.keySet()){
           if(!count2.containsKey(key)){
            continue;
           }
           int count = count1.get(key) > count2.get(key) ?count2.get(key):count1.get(key);
           int i =0;
           while(i<count){
               common.add(key);
               i++;
           }
       }

       int[] res = new int[common.size()];
       for(int i=0;i<res.length;i++){
           res[i] = common.get(i);
       }
       return res;

    }

    private Map<Integer,Integer> count(int[] nums){
        Map<Integer,Integer> count1 = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(!count1.containsKey(nums[i])){
                count1.put(nums[i],1);
            }else{
                count1.put(nums[i],count1.get(nums[i])+1);
            }
        }
        return count1;
    }

    public void quickSort(int[] nums, int start, int end){
        if(start >= end){
            return ;
        }
        int left = start, right = end;
        int flag = nums[start];
        while(left < right){
            while(left < right && nums[right] > flag){
                right --;
            }
            if(left < right){
                nums[right--] = nums[left];
            }
            while(left < right && nums[left] < flag){
                left ++;
            }
            if(left < right){
                nums[left++] = nums[right];
            }
        }
        nums[left] = flag;
        quickSort(nums,start,left-1);
        quickSort(nums,left+1,right);

    }

}
// @lc code=end

