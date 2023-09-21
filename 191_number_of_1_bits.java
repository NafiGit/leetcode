public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int k=0;k<32;k++){
            // n&(1<<k) check kth bit is set
            if((n&(1<<k))!=0){
                count++;
                System.out.println(k);
            }
        }
        
        // System.out.println(n&(1<<3));

        return count;
    }

}
