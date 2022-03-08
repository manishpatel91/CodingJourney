//Rearrange a LinkedList

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

public class RearrangeList {

  public static void reorder(ListNode head) {
    ListNode sp = head,fp = head, firsthalf = head;
    while(fp!=null && fp.next!=null)
    {
        if(fp.next==null)
            break;
        fp=fp.next;
        if(fp.next==null)
            break;
        fp=fp.next;
        sp=sp.next;
    }
    ListNode sechalf=reverse(sp.next);
    
    while(sechalf!=null && firsthalf!=null)
    {
        ListNode tempf=firsthalf.next;
        firsthalf.next=sechalf;
        firsthalf=tempf;

        ListNode temps=sechalf.next;
        sechalf.next=firsthalf;
        sechalf=temps;
    }
    if (firsthalf != null)
      firsthalf.next = null;
  }
  
 public static ListNode reverse(ListNode head) 
 {
    ListNode f = null,s = head, t= head.next;
    
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
    head.next.next.next.next.next = new ListNode(12);
    RearrangeList.reorder(head);
    while (head != null) {
      System.out.print(head.value + " ");
      head = head.next;
    }
  }
}
