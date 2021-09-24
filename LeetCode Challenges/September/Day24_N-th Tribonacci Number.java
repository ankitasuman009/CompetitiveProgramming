class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int[] arr = new int[38];
        int sum = 0;
        arr[0] = 0; arr[1] = arr[2] = 1;
        for(int i=3;i<=n;i++){
            sum = arr[i-1] + arr[i-2] + arr[i-3];
            arr[i] = sum;
        }
        return sum;
    }
}
