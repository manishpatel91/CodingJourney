//Given the head of a LinkedList and a number ‘k’, reverse every ‘k’ sized sub-list starting from the head. If, in the end, you are left with a sub-list with less than ‘k’ elements, reverse it too.

import java.util.*;

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

public class ReverseEveryKElements {

  public static ListNode reverse(ListNode head, int k) {

    ListNode list = head,rem=null,f=null,s=head,t=head.next,prev=s;
    
    while(list!=null)
    {
        int count=1;
        
        while(s!=null)
        {
            s.next=f;
            f=s;
            s=t;
            if(t != null)
                t=t.next;
            
            count++;    
            if(k==count)
                break;

                
        }
        
      //System.out.println(s .value);
        if(rem==null)
            head=f;
        else
        {
            rem.next=f;
        }
        prev.next=s;
        rem=prev;
        prev=s;
        list=s;
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);
    //head.next.next.next.next.next.next.next = new ListNode(8);
   
    ListNode result = ReverseEveryKElements.reverse(head, 3);
    System.out.print("Nodes of the reversed LinkedList are: ");
    while (result != null) {
      System.out.print(result.value + " ");
      result = result.next;
    }
  }
}
