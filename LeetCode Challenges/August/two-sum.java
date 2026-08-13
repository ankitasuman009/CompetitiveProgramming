class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            hashMap.put(nums[i], i);
        }
        for(int i=0; i<len; i++){
            int sub = target - nums[i];
            if(hashMap.containsKey(sub) && hashMap.get(sub) != i)
                return new int[]{i, hashMap.get(sub)};
        }
        return new int[]{};
    }
}
