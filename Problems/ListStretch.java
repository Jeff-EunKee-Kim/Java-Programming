public class ListStretch {
  public ListNode stretch (ListNode list, int amount){
      // replace statement below with code you write
      if (list == null || list.next == null) return list; 
      if (amount == 0 || amount ==1 ) return list; 

      ListNode head = list; 

      while(list != null){
      	ListNode temp = list.next; 
      	list.next = helper(list.info, amount-1);
      	while(list.next != null){
      		list = list.next; 
      	}
      	list.next = temp;
      	list = list.next; 
      }
      return head;
  }
  public ListNode helper (int val, int time){
  	
  	ListNode ans = new ListNode(val); 
  	ListNode dummy = ans; 
  	for (int i = 0; i< time-1; i++){
  		dummy.next = new ListNode(val);
  		dummy = dummy.next; 
  	}
  	return ans; 
  }
}