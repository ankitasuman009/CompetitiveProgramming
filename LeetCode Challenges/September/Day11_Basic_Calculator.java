class Solution {
    public int calculate(String s) {
        Stack<Integer> opnd = new Stack<>();
        int sign = 1, ans = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int sum = s.charAt(i) - '0';
                while(i+1<s.length() && Character.isDigit(s.charAt(i+1))){
                    sum  = sum * 10 + s.charAt(i+1) - '0';
                    i++;
                }
                ans += sum * sign;
            }
            else if(s.charAt(i)=='+') sign = 1;
            else if(s.charAt(i)=='-') sign = -1;
            else if(s.charAt(i)=='('){
                opnd.push(ans);
                opnd.add(sign);
                ans = 0;
                sign = 1;
            }
            else if(s.charAt(i)==')') ans = ans * opnd.pop() + opnd.pop();
    }
        return ans;
    }
}
