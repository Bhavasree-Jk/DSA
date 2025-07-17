class Solution {
    public int dayOfYear(String date) {
    String[] split=date.split("-");
    int count=0;
    count+=Integer.parseInt(split[2]);
    int j=Integer.parseInt(split[0]);
      int i=Integer.parseInt(split[1]);
    if(i>2){
    if(j%400==0||j%4==0&&j%100!=0){
        count+=1;
    }
    }
  
    

       if(i==1){
       count+=0;
       }
        if(i>=2){
        count+=31;
     
       }
         if(i>=3){
        count+=28;
       }
         if(i>=4){
        count+=31;
       }
         if(i>=5){
        count+=30;
       }
         if(i>=6){
        count+=31;
       }
         if(i>=7){
        count+=30;
       }
         if(i>=8){
        count+=31;
       }
         if(i>=9){
        count+=31;
       }
       if(i>=10){
        count+=30;
       }
       if(i>=11){
        count+=31;
       }
       if(i>=12){
        count+=30;
       }
       

    
    return count;
    }
}