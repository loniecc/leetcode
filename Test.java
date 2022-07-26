class Test{
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

    public static void main(String[] args){
        System.out.println(backspaceCompare("rjhbpvh","rm#jhbpvh"));
    }

     public static boolean backspaceCompare(String s, String t) {
        String s1 = parseStr(s);
        String t1 = parseStr(t);
        System.out.println(s1);
        System.out.println(t1);
        return s1.equals(t1);
    }

    private static String parseStr(String s){
        StringBuilder sb = new StringBuilder();
        
        int end = s.length()-1;
        int step = 0;
        int count =0;
        while(end > 0){
            while(end >= 0 && s.charAt(end) == '#'){
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