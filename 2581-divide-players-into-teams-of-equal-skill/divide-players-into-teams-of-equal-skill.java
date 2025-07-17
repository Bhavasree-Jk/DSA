class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        ArrayList<Integer> list=new ArrayList<>();
     int pro=1;
     long sum1=0;
     for(int i=0,j=skill.length-1;i<j;i++,j--){
        int sum=Math.abs(skill[i]+skill[j]);
        if(i==0){
        list.add(sum);
        sum1+=Math.abs(skill[i]*skill[j]);
        }
        else{
            if(list.contains(sum)){
                list.add(sum);
              sum1+=Math.abs(skill[i]*skill[j]);
                
            }
            else{
                return -1;
            }
        }

     }
    
     return sum1;      
    }
}