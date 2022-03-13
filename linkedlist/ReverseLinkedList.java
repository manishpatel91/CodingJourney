//Given the head of a Singly LinkedList, reverse the LinkedList. Write a function to return the new head of the reversed LinkedList.


 class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

public class ReverseLinkedList {

  public static ListNode reverse(ListNode head) {
    ListNode f=null,s=head,t=head.next;
    while(s!=null)
    {
        s.next=f;
        f=s;
        s=t;
        if(t!=null)
            t=t.next;
    }
    return f;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(2);
    head.next = new ListNode(4);
    head.next.next = new ListNode(6);
    head.next.next.next = new ListNode(8);
    head.next.next.next.next = new ListNode(10);

    ListNode result = ReverseLinkedList.reverse(head);
    System.out.print("Nodes of the reversed LinkedList are: ");
    while (result != null) {
      System.out.print(result.value + " ");
      result = result.next;
    }
  }
}
