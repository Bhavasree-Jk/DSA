class Solution {
    public double[] convertTemperature(double c) {
       double arr[]=new double[2];
      double k=(double)c+273.15;
      double f=(double)c*1.80+32.00;
      arr[0]=k;
      arr[1]=f;
     return arr; 
    
    
      
    }
}