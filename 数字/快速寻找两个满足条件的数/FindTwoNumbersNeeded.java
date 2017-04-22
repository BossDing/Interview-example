package test;

import java.util.Arrays;
import java.util.Hashtable;

public class FindTwoNumbersNeeded {

	public static int res[]=new int[2];
	//解法1
	//穷举2个数  加起来比对
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
	
	//解法2
	//对一个数a，查找sum-a在不在数组中
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

	//解法3
	//改进算法2  查找sum-a时先对数组进行排序
	public static int[] func3(int a[],int sum){
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			//二分查找  时间复杂度为O(log2N)
		}
		//总的时间复杂度为O(Nlog2N)
		return res;
	}
	
	//解法4
	//改进解法2  用hash表来存储数据
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
