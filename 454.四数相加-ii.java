/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer,Integer> sumAB = cal2Array(nums1, nums2);
        Map<Integer,Integer> sumCD = cal2Array(nums3, nums4);
        for(Integer number : sumAB.keySet()){
            if(sumCD.containsKey(-1 * number)){
                count += (sumAB.get(number) * sumCD.get(-1 * number));
            }
        }
        return count;
    }

    private Map<Integer,Integer> cal2Array(int[] nums1, int[] nums2){
        Map<Integer,Integer> sum = new HashMap<>();
        for(int i=0; i< nums1.length; i++){
            for(int j=0; j< nums2.length; j++){
                int s = nums1[i] + nums2[j];
                if(sum.containsKey(s)){
                    sum.put(s, sum.get(s)+1);
                }else{
                    sum.put(s, 1);
                }
            }
        }
        return sum;
    }
}
// @lc code=end