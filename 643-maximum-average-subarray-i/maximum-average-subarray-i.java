class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=0;
        int sum=0;
        double avg=0;
       double max = Double.NEGATIVE_INFINITY;
        while(right<nums.length){

            
                sum+=nums[right];
                if(right-left+1==k){
                  
                        avg=(double)sum/k;
                        if(avg>max){
                            max=avg;
                        }
                    
                sum-=nums[left];
                left++;
                }
                right++;
        }
        return max;
    }
}
             