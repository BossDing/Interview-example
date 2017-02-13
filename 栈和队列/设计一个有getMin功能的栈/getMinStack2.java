package stackandqueue;

import java.util.Stack;

public class getMinStack2 {

	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public getMinStack2(){
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	
	public void push(int newNum){
		if(this.stackMin.isEmpty()){
			this.stackMin.push(newNum);
		}
		else if(newNum<this.getMin()){
			this.stackMin.push(newNum);
		}
		else{
			int newMin=this.stackMin.peek();
			this.stackMin.push(newMin);
		}
		this.stackData.push(newNum);
	}
	
	public int pop(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("栈为空");
		}
		this.stackMin.pop();
		return this.stackData.pop();
	}
	
	
	public int getMin(){
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("栈为空");
		}
		return this.stackMin.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMinStack2 mystack = new getMinStack2();
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
