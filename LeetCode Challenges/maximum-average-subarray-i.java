class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        double avg = 0.0, res = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<=nums.length-k;i++){
            sum = 0;
            for(int j=i;j<k+i;j++){
                sum += nums[j];   
            }
            avg = (double)sum/k;
            res = res>avg?res:avg;
            //System.out.println("res" + res);
        }
        return res;
    }
}
