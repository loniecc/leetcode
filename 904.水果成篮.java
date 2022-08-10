/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */
// [1,1,6,5,6,6,1,1,1,1]
// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        //滑动窗口，当窗口右侧的元素跟已有元素不一致时，左侧移出。否则继续向右滑
        //左侧移除时，需要移除到最后一个+1处 -> 从右向左，第一个不是的就可以了
        int result = 0;
        // 当前窗口
        int length = 0;
        int left = 0;
        int[] trees = new int[]{-1,-1};
        for(int right = 0; right < fruits.length; right++){
            if(trees[0] == -1){
                if(trees[1] != fruits[right]){
                    trees[0] = trees[1];
                    trees[1] = fruits[right];
                    System.out.println(trees[0]+"--"+trees[1]);
                }
                length++;
            } else if(trees[0] != fruits[right] && trees[1] != fruits[right]){
                //跟历史所有窗口里的长度取最大值
                result = Math.max(result, length);
                //计算新窗口的起始长度
                left = right-1;
                while(left >0 && trees[1] == fruits[left]){
                    left--;
                }
                length = right - left;
                //构造新窗口
                trees[0] = trees[1];
                trees[1] = fruits[right];
                System.out.println(trees[0]+"--"+trees[1]+" length:"+length);
            }else{
                //如果出现 6566 的窗口，那么遍历完 窗口要从 [6,5] 变成 [5,6]
                if(fruits[right] != trees[1]){
                    trees[0] = trees[1];
                    trees[1] = fruits[right];
                }
                length++;
            }
        }
        return Math.max(result,length);

    }
}
// @lc code=end

