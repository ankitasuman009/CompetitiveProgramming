
package first;
import static java.lang.System.exit;
import java.lang.reflect.Array;
import java.util.*;



class Solution2 {
    
   public static int[] intersect(int[] nums1, int[] nums2) {
       
       List<Integer> li = new ArrayList<>();
       HashMap<Integer, Integer> hm = new HashMap<>();
       int[] large = nums1.length>=nums2.length?nums1:nums2;
       int[] small = nums2.length<=nums1.length?nums2:nums1;
       for(int l:large){
           if(hm.containsKey(l)) hm.put(l, (int)hm.get(l)+1);
           else hm.put(l, 1);
       }
       for(int s:small) if(hm.containsKey(s) && (int)hm.get(s)!=0){
           li.add(s); hm.put(s, (int)hm.get(s)-1);
       }
       int[] ans = new int[li.size()];
       for(int i=0;i<li.size();i++) ans[i] = li.get(i);
        return ans;
    }

    
   
    
    public static void main(String agrs[]){      
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] arr = intersect(arr1, arr2);
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
    }
}
