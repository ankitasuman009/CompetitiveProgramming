
package first;
import static java.lang.System.exit;
import java.lang.reflect.Array;
import java.util.*;



class Solution2 {
    
    
    public static int numUniqueEmails(String[] emails) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<emails.length;i++){
            String s = "", split[] = emails[i].split("@");
            char[] charArr = split[0].toCharArray();
            for(int j=0;j<charArr.length;j++){
                if(charArr[j]=='+') break;
                if(charArr[j]=='.') continue;
                s += charArr[j];
            }
            s += "@" + split[1];
            if(!hm.containsKey(s)) hm.put(s, 1);
        }
        return hm.size();
    }
    
   
    
    public static void main(String agrs[]){    
        String str[] = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(str));
    }
}
