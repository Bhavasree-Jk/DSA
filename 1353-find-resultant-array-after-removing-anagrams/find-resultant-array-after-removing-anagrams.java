class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            list.add(words[i]);
        }
        for(int i=1;i<list.size();i++){
         
          char[] ch=list.get(i).toCharArray();
          Arrays.sort(ch);
          char[] ch1=list.get(i-1).toCharArray();
          Arrays.sort(ch1);
          if(Arrays.equals(ch,ch1)){
          
           
            list.remove(i);
            i--;
          }
        }
        return list;
    }
}
      
