package listnode;

public class ListsEqual {
   public int equal (ListNode a1, ListNode a2) {
      // replace statement below with code you write
         while(a2 != null && a1 != null){
            if(a1.info != a2.info){
               return 0;
            }
            a2= a2.next;
            a1 = a1.next;
         }
         if(a1 == null && a2 == null){
            return 1;
         }
      return 0;
   }
}