package 倒转链表并输出;

/**
 * Created by thRShy on 2017/5/27.
 */
public class ReserveLink {
    public static class ListNode{
        int value;
        ListNode next=null;
        ListNode(int x){
            this.value=x;
        }
    }

    public static ListNode Resver(ListNode head){
        if(head==null)
            return null;
        ListNode next=null;
        ListNode pre=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
