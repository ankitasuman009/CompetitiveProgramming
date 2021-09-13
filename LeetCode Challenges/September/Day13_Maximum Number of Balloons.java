
package first;
import static java.lang.System.exit;
import java.lang.reflect.Array;
import java.util.*;



class Solution2 {
    
    public static int maxNumberOfBalloons(String text) {
        String str = "balloon";
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++) hm.put(str.charAt(i), 0);
        for(int i=0;i<text.length();i++){
            String s = String.valueOf(text.charAt(i));
            if(str.contains(s))  hm.put(text.charAt(i), (int)hm.get(text.charAt(i))+1);
        }
        int min = Integer.MAX_VALUE;
        for(Map.Entry e: hm.entrySet()) 
            if((char)e.getKey()=='l' || (char)e.getKey()=='o') min = min>(int)e.getValue()/2?(int)e.getValue()/2:min;
            else min = min>(int)e.getValue()?(int)e.getValue():min;
        return min;
    }

    
   
    
    public static void main(String agrs[]){      
        System.out.println(maxNumberOfBalloons("lloo"));
    }
}
