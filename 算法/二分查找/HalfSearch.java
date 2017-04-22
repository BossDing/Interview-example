package suanfa;

public class HalfSearch {

	//二分查找
	public static int func(int a[],int n,int x){
		int left=0;
		int right=n-1;
		int count=0;
		while(left<=right){
			count++;
			int middle=n/2+1;
			if(x==a[middle])
				return middle;
			if(x>a[middle])
				left=middle+1;
			else
				right=middle-1;
		}
		System.out.print("跑了"+count+"次");
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]=new int[]{1,2,3,4,5,6,7,8,9};
		System.out.println(func(nums,nums.length,4));
	}

}
