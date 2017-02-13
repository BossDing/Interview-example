package stackandqueue;

import java.util.Stack;

public class TwoStacksQueue {

	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;
	
	public TwoStacksQueue(){
		this.stackPush=new Stack<Integer>();
		this.stackPop=new Stack<Integer>();
	}
	
	public void add(int pushInt){
		this.stackPush.push(pushInt);
	}
	
	public int poll(){
		if(this.stackPop.empty()&&this.stackPush.empty()){
			throw new RuntimeException("Queue is empty");
		}else if(this.stackPop.empty()){
			while(!this.stackPush.empty()){
				this.stackPop.push(this.stackPush.pop());
			}
		}
		return this.stackPop.pop();
	}
	
	public int peek(){
		if(this.stackPop.empty()&&this.stackPush.empty()){
			throw new RuntimeException("Queue is empty");
		}else if(this.stackPop.empty()){
			while(!this.stackPush.empty()){
				this.stackPop.push(this.stackPush.pop());
			}
		}
		return this.stackPop.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
