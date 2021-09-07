
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
    
    
    public static ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode p1 = head, p2 = head.next;
        while(p2!=null){
            p1.next = p2.next;
            p2.next = head;
            head = p2;
            p2 = p1.next;
        }
        return head;
    }
  
    public static void main(String agrs[]){      
        int n = new Scanner(System.in).nextInt();
        ListNode head = null, p = head;
        for(int i=0;i<n;i++){
          ListNode newNode = new ListNode(new Scanner(System.in).nextInt());
          if(head==null) {
            head = newNode; p = newNode;
          }
          else p.next = newNode;
          p = newNode;
        }
        ListNode temp = reverseList(head);
        while(temp!=null) {
          System.out.println(temp.val);
          temp = temp.next;
        }
    }
}
