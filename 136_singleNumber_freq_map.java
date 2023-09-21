class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> fm = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(fm.containsKey(nums[i])){
                fm.put(nums[i], fm.get(nums[i])+1);
            }
            else{
                fm.put(nums[i], 1);
            }
            System.out.println(nums[i]);
        }
        System.out.println(fm.toString());
        for(Map.Entry<Integer, Integer> entry: fm.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
            
        }

        return nums[0];
    }
}
