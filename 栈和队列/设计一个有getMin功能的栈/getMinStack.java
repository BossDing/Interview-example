package stackandqueue;

import java.util.Stack;
/*
 * 题目:要实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * 要求:pop push getMin操作的时间复杂度都是O(1)
 * 
 * 
 * */


//思路一:集体看代码
public class getMinStack {

	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public getMinStack(){
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	
	public void push (int newNum){
		//如果最小栈为空，直接存入
		if(this.stackMin.isEmpty()){
			this.stackMin.push(newNum);
		}
		else if(newNum<=this.getMin()){
			this.stackMin.push(newNum);
		}
		this.stackData.push(newNum);
		
	}
	
	public int pop(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("栈为空");
		}
		int value=this.stackData.pop();
		if(value==this.getMin()){
			this.stackMin.pop();
		}
		return value;
	}
	
	public int getMin(){
		if(this.stackMin.isEmpty()){
			System.out.println("栈为空");
		}
		return this.stackMin.peek();
		//peek 查看栈顶元素而不删除
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMinStack mystack = new getMinStack();
		System.out.println("下面是操作步骤");
		System.out.println("压入元素4");
		mystack.push(4);
		System.out.println("压入元素2");
		mystack.push(2);
		System.out.println("压入元素8");
		mystack.push(8);
		System.out.println("最小值为"+mystack.getMin());
		//mystack.getMin();
		System.out.println("压入元素1");
		mystack.push(1);
		System.out.println("最小值为"+mystack.getMin());
		System.out.println("此时栈顶为"+mystack.stackData.peek());
		System.out.println("弹出栈中的"+mystack.pop());
		//mystack.pop();
		System.out.println("最小值为"+mystack.getMin());
		
		
	}

}
