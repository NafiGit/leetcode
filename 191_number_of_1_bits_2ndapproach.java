public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        // n & (n-1) iteratively
        int count = 0;
        while(n!=0){
            System.out.println(n);
            count++;
            n = n&(n-1);
        }
        return count;
    }

}
