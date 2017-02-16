package stackandqueue;

import java.util.Stack;

/*
 * 通过递归
 * 
 * 把一个栈内的元素 逆序
 * 
 * */

public class getAndRemoveStackButtom {

	public static int getLastAndRemoveStackButtom(Stack<Integer> stack){

		int result=stack.pop();
		if(stack.empty()){
			return result;
		}
		else{
			int last=getLastAndRemoveStackButtom(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reserve(Stack<Integer> stack){
		
		if(stack.isEmpty()){
			return;
		}
		int i=getLastAndRemoveStackButtom(stack);
		reserve(stack);
		stack.push(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack sta=new Stack<Integer>();
		sta.push(1);
		sta.push(2);
		sta.push(3);
		//System.out.println(getLastAndRemoveStackButtom(sta));
		//System.out.println(getLastAndRemoveStackButtom(sta));
		//System.out.println(getLastAndRemoveStackButtom(sta));
		//System.out.println(getLastAndRemoveStackButtom(sta));
		reserve(sta);
		System.out.println(sta.peek());
	}

}
