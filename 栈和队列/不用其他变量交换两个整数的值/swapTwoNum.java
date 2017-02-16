package stackandqueue;

//不用第三种变量来交换两个整数的值
//这里只用两种方法，还有栈和地址的方式  就不写了

public class swapTwoNum {

	//第一种方法，用算术
	public static void arithmetic(int a,int b){
		a=b-a;
		b=b-a;
		a=a+b;
		System.out.println(a+" "+b);
	}
	
	//第二种方法，用位
	public static void bit_operation(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=12;
		arithmetic(a,b);
		bit_operation(a,b);
		

	}

}
