class Solution {
    public int subarraySum(int[] nums, int k) {
        int arr[]=new int[nums.length];
       
         arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];


        }
          int count=0;
       
      
    for(int i=0;i<arr.length;i++){
          if(arr[i]==k){
            count++;
          }
        for(int j=i+1;j<arr.length;j++){
            int sum=arr[j]-arr[i];
            if(sum==k){
                count++;
            }
        }
    

    }
    return count;  
    }
}