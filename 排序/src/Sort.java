import java.util.Random;

/**
 * Created by thRShy on 2017/4/23.
 */
public class Sort {

    public static int[] randomInt(int n,int Max){
        Random ra=new Random();
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=ra.nextInt(Max);
        }
        return  res;
    }

    /**
     * 交换方法
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
    }

    /**
     * 输出方法
     * @param arr
     */
    public static void show(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }


    /**
     * 冒泡排序 - 简单优化版本 - 已验证
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }
        boolean needSort=true;
        for(int i=0;i<arr.length-1&&needSort;i++){
            needSort=false;
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    needSort=true;
                    swap(arr,j-1,j);
                }
            }
        }
        show(arr);
    }


    /**
     * 选择排序 - 已验证
     * @param arr
     */
    public static void selectSort(int[] arr){
        if(arr==null||arr.length==0)
            return;
        int minIndex=0;
        for(int i=0;i<arr.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])
                    minIndex=j;
            }
            if(minIndex!=i)
                swap(arr,minIndex,i);
        }
        show(arr);
    }


    /**
     * 插入排序 - 已验证
     * @param arr
     */
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int target = arr[i];
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
        show(arr);
    }


    public static void main(String[] args){
        int[] arr=randomInt(9,20);
//        bubbleSort(arr);
//        System.out.println("");
//        selectSort(arr);
        insertSort(arr);
    }
}
