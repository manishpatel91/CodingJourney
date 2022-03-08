// LinkedList cycle

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

public class LinkedListCycle {

  public static boolean hasCycle(ListNode head) {
    ListNode sp = head,fp = head, temp = head;
    
    if(temp == null || head.next == null)
        return false;
    if(temp.next == head )
        return true;
    while(fp!=null)
    {
        sp=sp.next;
        fp=fp.next.next;
        if(sp==fp)
            return true;
    }
    return false;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

    head.next.next.next.next.next.next = head.next.next;
    System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
  }
}
