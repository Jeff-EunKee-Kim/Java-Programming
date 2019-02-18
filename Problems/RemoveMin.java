package listnode;

import listnode.ListNode;

public class RemoveMin {
   public ListNode remove (ListNode list) {
      ListNode dummy = new ListNode(0, list);
      ListNode minBefore = dummy;
      ListNode min = list;
      while (dummy.next != null) {
         if (dummy.next.info < min.info) {
            min = dummy.next;
            minBefore = dummy;
         }
         dummy = dummy.next;
      }
      minBefore.next = min.next;
      if (list == min) {
         list = list.next;
      }
      return list;
   }
}
