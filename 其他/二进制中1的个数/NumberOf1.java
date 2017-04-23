package test;

//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。


public class NumberOf1 {
	
	public static int func(int n){
		int count=0;
		while(n!=0){
			++count;
			n=(n-1)&n;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=-23;
		System.out.println(func(n));
	}

}
