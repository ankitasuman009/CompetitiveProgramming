class Solution {
    public boolean checkDivisibility(int n) {
        if(n<10) return false;
        int sum = 0, product = 1, temp = n;
        while(temp>0){
            int firstDigit = temp%10;
            // int secondDigit = n/10;
            sum += firstDigit;
            product *= firstDigit;
            temp = temp/10;
        }
        if(n%(sum+product)==0) return true;
        return false;
    }
}
