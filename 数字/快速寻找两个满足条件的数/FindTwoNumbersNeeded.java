package test;

import java.util.Arrays;
import java.util.Hashtable;

public class FindTwoNumbersNeeded {

	public static int res[]=new int[2];
	//�ⷨ1
	//���2����  �������ȶ�
	public static int[] func1(int a[],int sum){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum){
					res[0]=a[i];
					res[1]=a[j];
					break;
				}
			}
		}
		return res;
	}
	
	//�ⷨ2
	//��һ����a������sum-a�ڲ���������
	public static int[] func2(int a[],int sum){
		for(int i=0;i<a.length;i++){
			for(int k=i+1;k<a.length;k++){
				if(a[k]==sum-a[i]){
					res[0]=a[i];
					res[1]=a[k];
					break;
				}
			}
		}
		return res;
	}

	//�ⷨ3
	//�Ľ��㷨2  ����sum-aʱ�ȶ������������
	public static int[] func3(int a[],int sum){
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			//���ֲ���  ʱ�临�Ӷ�ΪO(log2N)
		}
		//�ܵ�ʱ�临�Ӷ�ΪO(Nlog2N)
		return res;
	}
	
	//�ⷨ4
	//�Ľ��ⷨ2  ��hash�����洢����
	public static int[] func4(int a[],int sum){
		Hashtable nums=new Hashtable(a.length);
		for(int i=0;i<a.length;i++)
			nums.put(a[i], sum-a[i]);
		for(int i=1;i<a.length;i++){
			if(nums.contains(sum-a[i])){
				res[0]=a[i];
				res[1]=(int) nums.get(a[i]);
			}
		}	
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]=new int[]{5,6,1,4,7,9,8};
		int sum=10;
		func1(num,sum);
		System.out.println(res[0]+" "+res[1]);
		func4(num,sum);
		System.out.println(res[0]+" "+res[1]);
	}

}
