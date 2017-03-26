package suanfa;

public class maxLengthInTree {
	//定义节点
	public static class Node{
		Node pLeft;
		Node pRight;
		int nMaxLeft;
		int nMaxRight;
		char value;
	}
	
	static int nMaxlen=0;
	
	public void FindMaxLen(Node root){
		//遍历到叶子节点，返回
		if(root==null)
			return;
		if(root.pLeft==null)
			root.nMaxLeft=0;
		if(root.pRight==null)
			root.nMaxRight=0;
		if(root.pLeft!=null){
			FindMaxLen(root.pLeft);
		}
		if(root.pRight!=null)
			FindMaxLen(root.pRight);
		if(root.pLeft!=null){
			int nTempLen=0;
			if(root.pLeft.nMaxLeft>root.pLeft.nMaxRight)
				nTempLen=root.pLeft.nMaxLeft;
			else
				nTempLen=root.pLeft.nMaxRight;
			root.nMaxLeft=nTempLen+1;
		}
		
		if(root.pRight!=null){
			int nTempLen=0;
			if(root.pRight.nMaxRight>root.pRight.nMaxRight)
				nTempLen=root.pRight.nMaxLeft;
			else
				nTempLen=root.pRight.nMaxRight;
			root.nMaxRight=nTempLen+1;
		}
		
		if(root.nMaxLeft+root.nMaxRight>nMaxlen)
			nMaxlen=root.nMaxLeft+root.nMaxRight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
