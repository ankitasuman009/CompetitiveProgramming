class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
       int sum = 0, n = 0;
       String ans = "";
       for(int i=0;i<shifts.length;i++){
           sum += shifts[i];
       }
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           int j = 0;
           while(alpha[j]!=c) j++;
           int index = (j+sum)%26;
           ans += alpha[index];
           sum -= shifts[n++];
       }
       return ans;
    }
}
