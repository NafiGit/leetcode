class Solution {
    public int singleNumber(int[] a) {
        int ans = 0;
        for(int k = 0; k<32; k++){
            int setBitCount = 0;
            for(int n : a){
                // add bits at bit no k: 0
                // 0001
                // 0001
                // 0001
                // 0100
                // 0100
                // 0100
                // 0111
                // 0111
                // 0111
                // abcd
                // 0636
                // a b+6 c+3 d+6 = 1 6 4 6 => abcd = 1010
              
                if((n & (1 << k))!=0){
                    setBitCount++;
                }
            }
            if(setBitCount % 3 != 0)
                // set those bits as 1
                ans = ans|(1<<k);
            System.out.println();
        }
        return ans;
    }
}
