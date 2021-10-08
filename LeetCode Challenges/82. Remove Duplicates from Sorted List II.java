
package first;
import static java.lang.System.exit;
import java.lang.reflect.Array;
import java.util.*;



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



class Solution2 {
    
    public static void display(ListNode root) {
         if(root==null) return;
         System.out.print(root.val);
         display(root.next);
     }
    
   public static ListNode deleteDuplicates(ListNode head) {
        ListNode ans = null, p = head, temp = null;
        while(p!=null){
            ListNode p2 = p.next;
            int f = 0;
            while(p2!=null && p2.val==p.val){
                p2 = p2.next;
                f = 1;
            }
            if(f==0){
                ListNode newNode = new ListNode(p.val);
                if(ans==null) ans = newNode;
                else temp.next = newNode;
                temp = newNode;
            }
            p = p2;
        }
        return ans;
   }
    
   
    
    public static void main(String agrs[]){    
        int n1 = new Scanner(System.in).nextInt();
        ListNode head = null, p = null;
        for(int i=0;i<n1;i++){
            ListNode newNode = new ListNode(new Scanner(System.in).nextInt());
            if(head==null) head = newNode;
            else p.next = newNode;
            p = newNode;
        }
// display(head);
 
        display(deleteDuplicates(head));
    }
}
