package stackandqueue;

//���õ����ֱ�������������������ֵ
//����ֻ�����ַ���������ջ�͵�ַ�ķ�ʽ  �Ͳ�д��

public class swapTwoNum {

	//��һ�ַ�����������
	public static void arithmetic(int a,int b){
		a=b-a;
		b=b-a;
		a=a+b;
		System.out.println(a+" "+b);
	}
	
	//�ڶ��ַ�������λ
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
