
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
         while(temp!=null){
             System.out.print(temp.val);
             temp = temp.next;
         }
    }
    
    
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        ListNode[] ans = new ListNode[k];
        int n = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int limit = n/k, first = n%k;
        int i = 0;
        while(head!=null){
            ListNode newNode = null;
            if(i<first) for(int j=0;j<limit+1;j++){
                newNode = createNode(newNode, head.val);
                head = head.next;
                if(head==null) break;
            }
            else for(int j=0;j<limit;j++) {
                newNode = createNode(newNode, head.val);
                head = head.next;
                if(head==null) break;
            }
            ans[i] = newNode;
            i++;
        }
        while(i<k){
            ans[i] = new ListNode();
            i++;
        }
        return ans;
    }
    
   
    
    public static void main(String agrs[]){    
        int n2 = new Scanner(System.in).nextInt();
        ListNode head2 = null;
        for(int i=0;i<n2;i++)
          head2 = createNode(head2, new Scanner(System.in).nextInt());
        ListNode[] node = splitListToParts(head2, 3);
        for(int i=0;i<node.length;i++) {
            display(node[i]);
        }
    }
}
