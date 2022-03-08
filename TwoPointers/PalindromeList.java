//Palindrome list 

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

public class PalindromeList {

  public static boolean checkPalindrome(ListNode head) {
    ListNode sp = head,fp = head, temp = head;
    int counter=1;
    while(fp!=null && fp.next!=null)
    {
        if(fp.next==null)
            break;
        fp=fp.next;
        counter++;
        if(fp.next==null)
            break;
        fp=fp.next;
        counter++;
        
        sp=sp.next;
        
    }
    sp.next=reverse(sp.next);
    sp=sp.next;
    
    while(sp!=null)
    {
        if(sp.value!=temp.value)
            return false;
        sp=sp.next;
        temp=temp.next;
    }
    return true;
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

  public static void main(String[] args) 
  {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(1);
    head.next.next.next.next.next = new ListNode(6);
    System.out.println("Palindrome list =  : "+ PalindromeList.checkPalindrome(head));

  }
}
