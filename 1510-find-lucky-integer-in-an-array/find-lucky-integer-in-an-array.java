class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
    System.out.print(map);
    boolean val=false;
       int max=0;
       for(int i : map.keySet()){
        if(map.get(i)==i){
            val=true;
          if(i>max){
            max=i;

          }
           
        }
       }
       if(!val) return -1;
       return max;
    }
}