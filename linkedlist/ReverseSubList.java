//Given the head of a Singly LinkedList, reverse the LinkedList. Write a function to return the new head of the reversed LinkedList.


 class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

public class ReverseSubList {

  public static ListNode reverse(ListNode head, int p, int q) {
    ListNode f=null,s=head,t=head.next,temp=head,rem=null;
    while(temp!=null)
    {
        if(temp.value==p)
            break;
        rem=temp;
        temp=temp.next;
    }
    s=temp;
    t=s.next;
    f=rem;
    //System.out.println(rem.value+" "+f.value+" "+s.value+" "+t.value+" "+temp.value);
    while(s!=null)
    {
        s.next=f;
        f=s;
        s=t;
        if(t != null)
            t=t.next;
        if(f.value==q)
            break;

    }

    temp.next=s;

    if(rem==null){
        return f;
    }
    rem.next=f;
    return head;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode result = ReverseSubList.reverse(head, 3, 5);
    System.out.print("Nodes of the reversed LinkedList are: ");
    while (result != null) {
      System.out.print(result.value + " ");
      result = result.next;
    }
  }
}
