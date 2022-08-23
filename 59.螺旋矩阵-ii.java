/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int r=n-1,b=n-1,l=0,t=0;
        int num = 1, tar = n*n;
        while(num <=tar){
            for(int i=l; i<=r;i++) res[t][i] = num++;
            t++;
            for(int i=t; i<=b;i++) res[i][r] = num++;
            r--;
            for(int i=r; i>=l;i--) res[b][i] = num++;
            b--;
            for(int i=b; i>=t;i--) res[i][l] = num++;
            l++;
        }
        return res;
    }
}
// @lc code=end

