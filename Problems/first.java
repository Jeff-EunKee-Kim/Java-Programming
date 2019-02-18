
public class first{
    public static class ListNode{
        int val;
        ListNode next; 
        ListNode(int a){
            val = a; 
        }

    }
    public static ListNode findmid(ListNode head){
        // The pointer used to disconnect the left half from the mid node.
    ListNode slowPtr = head;
    ListNode fastPtr = head;
    ListNode prevPtr = slowPtr;

    
    prevPtr = new ListNode(1212);
        while(prevPtr != null){
            System.out.println("prev = " + prevPtr.next.val);
            prevPtr = prevPtr.next; 
        }

    while(slowPtr != null){
        System.out.println("slow = " + slowPtr.next.val);
        slowPtr = slowPtr.next; 
    }


    return slowPtr;
    }


    public static void main(String[] args) {
        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        b.next.next = new ListNode(3);
        b.next.next.next = new ListNode(4);
        b.next.next.next.next = new ListNode(5);
        b.next.next.next.next.next = new ListNode(6);
        
        findmid(b);

    }    
}