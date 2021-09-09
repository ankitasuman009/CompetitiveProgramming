
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
    static ListNode head;
   public static void deleteNode(ListNode node) {
        if(node==null) return;
        if(head.val==node.val) {
            head = head.next;
            return;
        }
        ListNode p = head;
        while(p.next!=null && p.next.val!=node.val) p = p.next;
        ListNode temp = p.next;
        if(temp!=null) p.next = temp.next;
        else p.next = null;
    }
    
   
    
    public static void main(String agrs[]){      
        int n1 = new Scanner(System.in).nextInt();
        head = null;
        for(int i=0;i<n1;i++)
          head = createNode(head, new Scanner(System.in).nextInt());
        System.out.println("enter ele ");
        ListNode node = (createNode(null, new Scanner(System.in).nextInt()));
        deleteNode(node);
        display(head);

    }
}
