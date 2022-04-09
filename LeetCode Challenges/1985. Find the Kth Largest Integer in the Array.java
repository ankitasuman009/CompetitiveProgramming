class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i] = Integer.parseInt(nums[i]);
        for(int i=0;i<arr.length-1;i++){
            int temp = i;
            for(int j=i+1;j<arr.length;j++) if(arr[temp]<arr[j]) temp = j;  //descending order
            if(temp!=i) {
                int t = arr[i];
                arr[i] = arr[temp];
                arr[temp] = t;
            }
        }
        return String.valueOf(arr[k-1]);
    }
}
