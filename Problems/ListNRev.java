public class ListNRev {
      public ListNode make(int n) {
          // replace statement below with code you write
          ListNode list = listn(n);
          if(n ==1) return list; 
          ListNode last = list;
          while(last.next != null){
          	last = last.next; 
          }
          last.next = make(n-1);
          return list;

          return null;
      }
      public ListNode listn(int n){
      	ListNode head = new ListNode(N);
      	ListNode last = head;
      	for(int k = 0; k< n-1; k++){
      		last.next = ListNode(n);
      		last = last.next; 
      	}
      	return head;
      }
  }