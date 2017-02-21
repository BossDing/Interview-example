package stackandqueue;


import java.util.LinkedList;

/*
 * ���ɴ����������ֵ
 *
 * Ҫ��ʱ�临�Ӷ�ΪO(N)
 *
 * �ؼ��㣺˫�˶���
 *
 * ���˭�з���Ҫ��Ļ���õĽⷨ   ��ӭ�������� thrsky@163.com             Likang
 *
 * */
public class getMaxWindow {

    
	public static int[] getMaxWindow(int[] arr,int w){

        //�쳣�������
		if(arr==null||w<1||arr.length<w){
			return null;
		}
		LinkedList<Integer> qmax=new LinkedList<Integer>();
		int[] res=new int[arr.length+w-1];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
				qmax.pollLast();
			}
			qmax.addLast(i);
			if (qmax.peekFirst() == i - w)
				qmax.pollFirst();
			if (i >= w - 1)
				res[index++] = arr[qmax.peekFirst()];
		}

		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=new int[8];
		arr[0]=4;
		arr[1]=3;
		arr[2]=5;
		arr[3]=4;
		arr[4]=3;
        arr[5]=3;
        arr[6]=6;
        arr[7]=7;
		
		int result[]=getMaxWindow(arr,3);
		for (int l=0;l<6;l++){
			System.out.println(result[l]);
		}
		

	}

}
