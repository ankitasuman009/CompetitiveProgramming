class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hashMap1 = new HashMap<>();
        Map<Character, Integer> hashMap2 = new HashMap<>();
        for(char c: s.toCharArray()){
            if(hashMap1.containsKey(c)) hashMap1.put(c, hashMap1.get(c)+1);
            else hashMap1.put(c, 1);
            }
            for(char c: t.toCharArray()){
            if(hashMap1.containsKey(c)) hashMap1.put(c, hashMap1.get(c)-1);
            else return false;
            }
            for(Map.Entry<Character, Integer> e: hashMap1.entrySet()){
                if(e.getValue()!=0) return false;
            }
            return true;
    }
}
