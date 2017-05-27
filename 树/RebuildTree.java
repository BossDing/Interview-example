/**
 * Created by thRShy on 2017/5/27.
 */

/**
 * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 *
 * 思路：递归思想，每次将左右两颗子树当成新的子树进行处理，
 * 中序的左右子树索引很好找，
 * 前序的开始结束索引通过计算中序中左右子树的大小来计算，
 * 然后递归求解，直到startPre>endPre||startIn>endIn说明子树整理完到。
 * 方法每次返回左子树活右子树的根节点
 */

public class RebuildTree {
    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.value=x;
        }
    }

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }

    public TreeNode reConstructBinaryTree(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(pre[preStart]);
        for(int i=inStart;i<=inEnd;i++){
            if(in[i]==pre[preStart]){
                root.left=reConstructBinaryTree(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
                root.right=reConstructBinaryTree(pre,i+1+preStart-inStart,preEnd,in,i+1,inEnd);
            }

        }
        return root;
    }
}
