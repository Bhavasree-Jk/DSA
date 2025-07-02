
import java.math.BigInteger;


class Solution {
    public String multiply(String num1, String num2) {
        BigInteger b = new BigInteger(num1);
        BigInteger k = new BigInteger(num2);
        BigInteger result = b.multiply(k);  
        return result.toString();   
    }
}
