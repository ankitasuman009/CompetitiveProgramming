
package first;
import static java.lang.System.exit;
import java.lang.reflect.Array;
import java.util.*;



class Solution2 {
    
   public static int maxTurbulenceSize(int[] arr) {
       if(arr.length<2) return arr.length;
        int f2 = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                f2 = 1; break;
            }
        }
        if(f2==0) return 1;
       int max = 0;
       for(int i=1;i<arr.length;i++){
           if(arr[i-1]>arr[i]){
               int f = 0, c = 2;
                for(int j=i;j<arr.length-1;j++){
                    if(f==0 && arr[j]<arr[j+1]) f = 1;
                    else if(f==1 && arr[j]>arr[j+1]) f = 0;
                    else break;
                    c++;
                }
                max = Math.max(c, max);
           }
           else if(arr[i-1]<arr[i]){
               int f = 0, c = 2;
                for(int j=i;j<arr.length-1;j++){
                    if(f==0 && arr[j]>arr[j+1]) f = 1;
                    else if(f==1 && arr[j]<arr[j+1]) f = 0;
                    else break;
                    c++;
                }
                max = Math.max(c, max);
           }
       } 
       return max;
   }

    
   
    
    public static void main(String agrs[]){      
        int[] arr1 = {100};
        System.out.println(maxTurbulenceSize(arr1));
    }
}
