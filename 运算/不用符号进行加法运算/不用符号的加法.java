package test;

public class 不用符号的加法 {
	
	public static int Add(int a,int b){
		while(b!=0){
			int temp=a^b;
			b=(a&b)<<1;
			a=temp;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(7,6));
	}

}
