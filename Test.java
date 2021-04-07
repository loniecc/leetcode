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
        int[] a = new int[]{5};
        quickSort(a,0,a.length-1);
        for(int i =0 ;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}