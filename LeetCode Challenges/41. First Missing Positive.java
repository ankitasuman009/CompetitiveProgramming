
package first;
import static java.lang.System.exit;
import java.lang.reflect.Array;
import java.util.*;



class Solution2 {
    
    public static int firstMissingPositive(int[] nums) {
        if(nums.length==1) {
            if(nums[0]<=0) return 1;
            if(nums[0]==1) return 2;
            return 1;
        }
        Arrays.sort(nums);
        int n = 1;
        for(int i=0;i<nums.length;){
            while(i<nums.length && nums[i]<=0) i++;
            
            if(i==nums.length || nums[i]!=n) return n;
            while(i<nums.length && nums[i]==n) i++;
            n++;
        }
        return n;
    }

    
   
    
    public static void main(String agrs[]){      
        int[] arr1 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr1));
    }
}
