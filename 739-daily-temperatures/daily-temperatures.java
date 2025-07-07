class Solution {
    public int[] dailyTemperatures(int[] arr) {
     Stack<Integer> stack=new Stack<>();
     int[] nums=new int[arr.length];
     for(int i=0;i<arr.length;i++){
        while(!stack.isEmpty()&&arr[i]>arr[stack.peek()]){
            int index=stack.pop();
            nums[index]=i-index;

        }
        stack.push(i);
     }
     return nums;
    }
}