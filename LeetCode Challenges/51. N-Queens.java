
package first;
import static java.lang.System.exit;
import java.lang.reflect.Array;
import java.util.*;


class Solution2 {
    
   static List<List<Integer>> li = new ArrayList<List<Integer>>();
    public static boolean valid(int[] arr, int k, int i){
        for(int j=0;j<k;j++){
            if(arr[j]==i || Math.abs(arr[j]-i)==Math.abs(j-k)) return false;
        }
        return true;
    }
    public static void formation(int[] arr, int k, int n){
        for(int i=0;i<n;i++){
            if(valid(arr, k, i)){
                arr[k] = i;
                if(k==n-1){
                    List<Integer> l = new ArrayList<>();
                    for(int a:arr) {
                        l.add(a);
                    }
                    li.add(l);
                }
                formation(arr, k+1, n);
            }  
        }
    }  
    public static List<List<String>> solveNQueens(int n) {
        int arr[] = new int[n];
        formation(arr, 0, n);
        List<List<String>> ans = new ArrayList<List<String>>();
        for(List l: li){
            List<String> a = new ArrayList<>();
            for(int i=0;i<l.size();i++){
                String str = "";
                for(int j=0;j<n;j++) if(j==(int)l.get(i)) str += "Q";
                else str += ".";
                a.add(str);
            }
            ans.add(a);
        }
        return ans;
    }

    
   
    
    public static void main(String agrs[]){   
      
        List<List<String>> li = solveNQueens(4);
        for(List<String> l:li){
            System.out.println(l);
        }
    }
}
