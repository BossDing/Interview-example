package test;

import java.util.Stack;

public class FindFirstCommonNode {

	public class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val=val;
		}
	}
	public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
		if(pHead1==null||pHead2==null)
			return null;
		Stack<ListNode> stack1=new Stack<>();
		Stack<ListNode> stack2=new Stack<>();
		
		while(pHead1!=null){
			stack1.push(pHead1);
			pHead1=pHead1.next;
		}
		while(pHead2!=null){
			stack2.push(pHead1);
			pHead2=pHead2.next;
		}
		
		ListNode commonListNode=null;
		
		while(!stack1.isEmpty()&&!stack2.isEmpty()&&stack1.peek()==stack2.peek()){
			stack2.pop();
			commonListNode=stack1.pop();
		}
		
		return commonListNode;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
