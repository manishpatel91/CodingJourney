//Middle of the LinkedList

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

public class MiddleofLinkedList {

  public static ListNode middleElement(ListNode head) {
    ListNode sp = head,fp = head, temp = head;
    while(fp!=null && fp.next!=null)
    {
        sp=sp.next;
        fp=fp.next.next;
    }
    return sp;
  }

  public static void main(String[] args) 
  {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    //head.next.next.next.next.next = new ListNode(6);
    ListNode headcycle= MiddleofLinkedList.middleElement(head);
    System.out.println("Middle element is : "+ middleElement(head).value);

  }
}
