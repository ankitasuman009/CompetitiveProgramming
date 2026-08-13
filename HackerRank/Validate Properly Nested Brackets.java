public static boolean areBracketsProperlyMatched(String code_snippet) {
    // Write your code here
        Stack<Character> sta = new Stack<>();
        for(int i=0; i<code_snippet.length(); i++){
            if(code_snippet.charAt(i) == '(' || code_snippet.charAt(i) == '{' || code_snippet.charAt(i) == '['){
                sta.add(code_snippet.charAt(i));
            }
            else if(code_snippet.charAt(i) == ')'){
                if(sta.isEmpty() || sta.pop() != '(') return false;
            }
            else if(code_snippet.charAt(i) == '}'){
                if(sta.isEmpty() || sta.pop() != '{') return false;;
            }
            else if(code_snippet.charAt(i) == ']'){
                if(sta.isEmpty() || sta.pop() != '[') return false;;
            }
        }
        if(!sta.isEmpty()) return false;
        return true;
    }
