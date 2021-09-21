
package first;
import static java.lang.System.exit;
import java.lang.reflect.Array;
import java.util.*;


class Solution2 {
    
  public static int findMaxConsecutiveOnes(int[] nums) {
      int c = 0, max = 0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]==1) c++;
          else {
              max = Math.max(max, c);
              c = 0;
          }
      }
        return Math.max(max, c);
    }
    
   
    
    public static void main(String agrs[]){      
        int[] arr1 = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(arr1));
    }
}
