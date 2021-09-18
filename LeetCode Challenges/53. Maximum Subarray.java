class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                max = max<sum?sum:max;
            }
        }
        return max;
    }
}
