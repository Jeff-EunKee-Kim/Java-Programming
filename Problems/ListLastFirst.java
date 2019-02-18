package listnode;

public class ListLastFirst {
   public ListNode move(ListNode list) {
      // replace statement below with code you write
      if(list == null || list.next == null){
         return list;
      }
      ListNode first = list;
      ListNode last = list;
      while(list != null){
         if(list.next.next == null){
            last = list.next;
            list.next = null;
         }
         list = list.next;
      }
      last.next = first;
      return last;
   }
}