//Given the head of a Singly LinkedList that contains a cycle, write a function to find the starting node of the cycle.

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

public class StartofLinkedListCycle {

  public static ListNode hasCycle(ListNode head) {
    ListNode sp = head,fp = head, temp = head;
    while(fp!=null && fp.next!=null)
    {
        sp=sp.next;
        fp=fp.next.next;
        if(sp==fp)
            return sp;
    }
    return null;
  }

public static ListNode headOfCycle(ListNode head) {
    ListNode first = head,second=hasCycle(head);
    if(second == null)
        return null;
    while(first!=second)
    {
       first=first.next;
       second=second.next;
    }
    return first;
  }

  public static void main(String[] args) 
  {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    ListNode headcycle= StartofLinkedListCycle.headOfCycle(head);
    System.out.println("LinkedList has cycle: "+ ((headcycle==null)?"No cycle found":"head is at "+headcycle.value));

    head.next.next.next.next.next.next = head.next.next;
    headcycle= StartofLinkedListCycle.headOfCycle(head);
    System.out.println("LinkedList has cycle: " + ((headcycle==null)?"No cycle found":"head is at "+headcycle.value)); 
  }
}
