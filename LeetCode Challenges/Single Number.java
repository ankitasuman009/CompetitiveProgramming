class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==0 || nums.length==2) return 0;
        int f = 0;
        HashMap hm = new HashMap();
        for(int i=0;i<nums.length-1;i++){
            f = 0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                f = 1; hm.put(nums[i], 1); break; }
            }
            if(!hm.containsKey(nums[i]) && f==0) return nums[i];
            
        }
        return nums[nums.length-1];
    }
}
