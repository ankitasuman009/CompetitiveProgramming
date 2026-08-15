class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] num = new int[2];
        for(int i=0;i<numbers.length;i++){
            int sub = target - numbers[i];
            if(hashMap.containsKey(sub)) {
                num[0] = hashMap.get(sub);
                num[1] = i+1;
                return num;
            }
            hashMap.put(numbers[i], i+1);
        }
        return num;
    }
}
