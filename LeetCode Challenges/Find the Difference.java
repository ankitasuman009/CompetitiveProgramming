class Solution {
    public char findTheDifference(String s, String t) {
         if(s.length()==0) return t.charAt(0);
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();
        
        for(int i=0;i<s.length();i++) 
            if(hms.containsKey(s.charAt(i))) hms.put(s.charAt(i), (int)hms.get(s.charAt(i))+1);
            else hms.put(s.charAt(i), 1);
        for(int i=0;i<t.length();i++) 
            if(hmt.containsKey(t.charAt(i))) hmt.put(t.charAt(i), (int)hmt.get(t.charAt(i))+1);
            else hmt.put(t.charAt(i), 1);
        
        
        for(Map.Entry<Character, Integer> e: hmt.entrySet()) if(hms.get((char)e.getKey())!=hmt.get((char)e.getKey())) return (char)e.getKey();
        return t.charAt(0);
    }
}
