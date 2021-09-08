
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

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//    
//    
//    static TreeNode root;
//     public static TreeNode insert(TreeNode root, int num) {
//         if(root==null) {
//             if(num==-1) return null;
//             return new TreeNode(num);
//         }
//         if(root.left==null) {
//             if(num==-1) root.left = null;
//             else root.left = new TreeNode(num);
//         }
//         else if(root.left!=null)  insert(root.left, num);
//         else if(root.right==null)  {
//             if(num==-1) root.right = null;
//             else root.right = new TreeNode(num);
//         }
//         else insert(root.right, num);
//         
//         return root;
//     }
//     
//     public static void display(TreeNode root) {
//         if(root==null) return;
//         System.out.print(root.val);
//         display(root.left);
//         display(root.right);
//     }
//    
//
//}


class Solution2 {
    
    
//    public static ListNode reverseList(ListNode head) {
//        if(head==null) return null;
//        if(head.next==null) return head;
//        ListNode p1 = head, p2 = head.next;
//        while(p2!=null){
//            p1.next = p2.next;
//            p2.next = head;
//            head = p2;
//            p2 = p1.next;
//        }
//        return head;
//    }
    
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
    
   public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       if(list1==null) return list2;
       if(list2==null) return list1;
       ListNode p1 = list1, p2 = list1; 
       while(p1.next!=null && a>1){
           p1 = p1.next;
           a--;
       }
       while(b>0){
           p2 = p2.next;
           b--;
       }
       while(list2!=null){
           p1.next = list2;
           p1 = list2;
           list2 = list2.next;
       }
       p1.next = p2.next;
       return list1;
    }
    
   
    
    public static void main(String agrs[]){      
        int n1 = new Scanner(System.in).nextInt();
        ListNode head1 = null;
        for(int i=0;i<n1;i++)
          head1 = createNode(head1, new Scanner(System.in).nextInt());
        System.out.println("enter n for second list");
        int n2 = new Scanner(System.in).nextInt();
        ListNode head2 = null;
        for(int i=0;i<n2;i++)
          head2 = createNode(head2, new Scanner(System.in).nextInt());
      display(mergeInBetween(head1, 3, 4, head2));

    }
}
