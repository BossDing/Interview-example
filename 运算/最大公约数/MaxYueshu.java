package test;

public class MaxYueshu {
	
	//һ�д��뷵�����Լ��
	public static int func(int a,int b){
		return (b==0)?a:func(b,a%b);
	}
	
	//x��y�����Լ��  ��   (x-y)��y�����Լ����һ����
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
