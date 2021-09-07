
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
    
    public static ListNode createNode(ListNode head, int num) {
        if(head==null) return new ListNode(num);
        ListNode p = head;
        while(p.next!=null){
            p = p.next;
        }
        ListNode newNode = new ListNode(num);
        p.next = newNode;
        return head;
    }
    
    public static void display(ListNode temp){
         while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    
   public static ListNode deleteDuplicates(ListNode head) {
       if(head==null) return null;
       if(head.next==null) return head;
        ListNode p1 = head;
        while(p1!=null){
            int num = p1.val;
            ListNode p2 = p1;
            while(p2.next!=null && p2.next.val==num) p2 = p2.next;
            p1.next = p2.next;
            p1 = p1.next;
        }
        return head;
    }
    
   
    
    public static void main(String agrs[]){      
        int n = new Scanner(System.in).nextInt();
        ListNode head = null;
        for(int i=0;i<n;i++)
          head = createNode(head, new Scanner(System.in).nextInt());
       display(deleteDuplicates(head));
    }
}
