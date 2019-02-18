package listnode;

public class ListNode {
   public int info;
   public ListNode next;
   public ListNode(int x){
      info = x;
   }
   ListNode(int x, ListNode node){
      info = x;
      next = node;
   }
}
