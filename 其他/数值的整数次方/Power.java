package test;

//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

public class Power {
	

	/**
	 * 1.全面考察指数的正负、底数是否为零等情况。 * 
	 * 2.写出指数的二进制表达，例如13表达为二进制1101。 * 
	 * 3.举例:10^1101 = 10^0001*10^0100*10^1000。 * 
	 * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。 
	 * */
	public static double Power(double base, int exponent) {
		int n=Math.abs(exponent);
		if(n==0)
			return 1;
		if(n==1)
			return base;
		double result=Power(base,n>>1);
		result*=base;
		if((n&1)==1)
			result*=base;
		if(exponent<0)
			result=1/result;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power(2,-2));
	}

}
