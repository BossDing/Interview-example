package test;

//����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��


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
