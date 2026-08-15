class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
     Arrays.sort(nums);
        int max = 1, counter = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1) counter++;
            else counter=1;
            max = Math.max(max, counter);
        }
        return max;    
    }
}
