/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
       Queue<Node> store = new LinkedList<>();
       if(root!=null) q.add(root);
       while(!q.isEmpty()){
           Node curr = q.poll();
           if(q.size()==0) curr.next = null;
           else{
               curr.next = q.peek();
           }
           if(curr.left!=null) store.add(curr.left);
           if(curr.right!=null) store.add(curr.right);
           if(q.size()==0){
               q = new LinkedList<>(store);
               store.clear();
           }
       }
       return root;
    }
}
