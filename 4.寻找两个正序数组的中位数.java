/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return findMedianSortedArraysRecurse(nums1,0,nums1.length-1,nums2,0,nums2.length-1);
    }

    public double findMedianSortedArraysRecurse(int[] nums1,int p1l,int p1r, int[] nums2,int p2l, int p2r) {
        if(p1l>p1r){
            return getMid(nums2,p2l,p2r);
        }

        if(p2l>p2r){
            return getMid(nums1,p1l,p1r);
        }
        
        double md1 = getMid(nums1,p1l,p1r);
        double md2 = getMid(nums2,p2l,p2r);

        if(md1 == md2){
            return md2;
        }

        int mid1Index = (p1l+p1r)/2;
        int mid2Index = (p2l+p2r)/2;
        if (md1 > md2){
            return findMedianSortedArraysRecurse(nums1,p1l,mid1Index,nums2,mid2Index,p2r);
        }else{
            return findMedianSortedArraysRecurse(nums1,mid1Index,p1r,nums2,p1l,mid2Index);
        }
    }

    public double getMid(int[] nums, int left, int right){
        if((right - left)% 2 == 0){
            return nums[(right+left)/2];
        }else{
            return (nums[(right+left)/2] + nums[(right+left)/2] +1) / 2d;
        }
    }

}
// @lc code=end

