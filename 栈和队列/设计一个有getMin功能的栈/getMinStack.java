package stackandqueue;

import java.util.Stack;
/*
 * ��Ŀ:Ҫʵ��һ�������ջ����ʵ��ջ�Ļ������ܵĻ����ϣ���ʵ�ַ���ջ����СԪ�صĲ���
 * Ҫ��:pop push getMin������ʱ�临�Ӷȶ���O(1)
 * 
 * 
 * */


//˼·һ:���忴����
public class getMinStack {

	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public getMinStack(){
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	
	public void push (int newNum){
		//�����СջΪ�գ�ֱ�Ӵ���
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
			throw new RuntimeException("ջΪ��");
		}
		int value=this.stackData.pop();
		if(value==this.getMin()){
			this.stackMin.pop();
		}
		return value;
	}
	
	public int getMin(){
		if(this.stackMin.isEmpty()){
			System.out.println("ջΪ��");
		}
		return this.stackMin.peek();
		//peek �鿴ջ��Ԫ�ض���ɾ��
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMinStack mystack = new getMinStack();
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
