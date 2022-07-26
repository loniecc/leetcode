
// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = parseStr(s);
        String t1 = parseStr(t);
        return s1.equals(t1);
    }

    private String parseStr(String s){
         StringBuilder sb = new StringBuilder();
        
        int end = s.length()-1;
        int step = 0;
        while(end > 0){
            while(end > 0 && s.charAt(end) == '#'){
                end--;
                step++;
            }
            while(end > -1 && step > 0){
                end--;
                if(end > 0 && s.charAt(end) == '#'){
                    step++;
                }else{
                    step--;
                }
            }
            if(end < 0){
                return sb.toString(); 
            }
            if(s.charAt(end) != '#'){
                sb.append(s.charAt(end));
                end--;
            }
         
        }

        if(end == 0 && s.length()> 0 && s.charAt(0) != '#'){
            sb.append(s.charAt(0));
        }
        return sb.toString();
    }
}
// @lc code=end

