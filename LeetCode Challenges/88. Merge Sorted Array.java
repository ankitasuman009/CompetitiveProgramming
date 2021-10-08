
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
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ListNode head1 = null, head2 = null, p = null;
        for(int i=0;i<m;i++){
            ListNode newNode = new ListNode(nums1[i]);
            if(head1==null)  head1 = newNode; 
            else p.next = newNode;
            p = newNode;
        }
        p = null;
        for(int i=0;i<n;i++){
            ListNode newNode = new ListNode(nums2[i]);
            if(head2==null)  head2 = newNode; 
            else p.next = newNode;
            p = newNode;
        }
        int i = 0;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                nums1[i] = head1.val;
                head1 = head1.next; }
            else {
                nums1[i] = head2.val;
                head2 = head2.next;
            }
            i++;
        }
        while(head1!=null){
            nums1[i++] = head1.val;
                head1 = head1.next;
        }
        while(head2!=null){
            nums1[i++] = head2.val;
                head2 = head2.next;
        }
        for(int j=0;j<nums1.length;j++) System.out.println(nums1[j]);
    }
    
   
    
    public static void main(String agrs[]){    
        int[] arr1 = {0};
        int[] arr2 = {1};
        merge(arr1, 0, arr2, 1);
    }
}
