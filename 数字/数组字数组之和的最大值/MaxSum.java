package test;

public class MaxSum {

	public int MaxSum(int a[],int n){
		int start[]=new int[a.length];
		int all[]=new int[a.length];
		start[n-1]=a[n-1];
		all[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--){
			start[i]=max(a[i],start[i+1]+a[i]);
			all[i]=max(all[i+1],start[i]);
		}
		return all[0];
		
	}
	public int max(int x,int y){
		return (x>y)?x:y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxSum s=new MaxSum();
		int a[]=new int[]{-2,5,3,-6,4,-8,6};
		System.out.println(s.MaxSum(a, 7));
	}

}
