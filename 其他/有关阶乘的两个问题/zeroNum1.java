package test;

/*
 * 给定一个非负整数N,返回N！结尾的末尾为0 的数量
 * 
 * 例如 3！=6  末尾没有0 则返回0
 * 
 * */

public class zeroNum1 {

	private int num;
	public static int zeroNum1(int num){
		
		if(num<4){
			return 0;
		}
		
		int result=0;
		int cur=0;
		
		for(int i=5;i<num+1;i=i+5){
			cur=i;
			while(cur%5==0){
				result++;
				cur/=5;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zeroNum1(1000000000));
	}

}
