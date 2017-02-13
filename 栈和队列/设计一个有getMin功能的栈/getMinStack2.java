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
			throw new RuntimeException("ջΪ��");
		}
		this.stackMin.pop();
		return this.stackData.pop();
	}
	
	
	public int getMin(){
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("ջΪ��");
		}
		return this.stackMin.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMinStack2 mystack = new getMinStack2();
		System.out.println("�����ǲ�������");
		System.out.println("ѹ��Ԫ��4");
		mystack.push(4);
		System.out.println("ѹ��Ԫ��2");
		mystack.push(2);
		System.out.println("ѹ��Ԫ��8");
		mystack.push(8);
		System.out.println("��СֵΪ"+mystack.getMin());
		//mystack.getMin();
		System.out.println("ѹ��Ԫ��1");
		mystack.push(1);
		System.out.println("��СֵΪ"+mystack.getMin());
		System.out.println("��ʱջ��Ϊ"+mystack.stackData.peek());
		System.out.println("����ջ�е�"+mystack.pop());
		//mystack.pop();
		System.out.println("��СֵΪ"+mystack.getMin());
		

	}

}
