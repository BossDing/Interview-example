package test;

public class MaxYueshu {
	
	//一行代码返回最大公约数
	public static int func(int a,int b){
		return (b==0)?a:func(b,a%b);
	}
	
	//x和y的最大公约数  与   (x-y)和y的最大公约数是一样的
	public static int func2(int a,int b){
		if(a<b)
			return func(b,a);
		if(b==0)
			return a;
		else
			return func(a-b,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(32,12));
		System.out.println(func2(32,12));
	}

}
