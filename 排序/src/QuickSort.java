import java.util.Random;

/**
 *
 * 快速排序
 * Created by thRShy on 2017/4/23.
 */
public class QuickSort {

    /**
     * 优化的快速排序
     */
    public static class QuickSort2{
        public static int partition(int[] arr,int begin,int end){
            int Key=arr[begin];
            while(begin<end){
                while(begin<end&&arr[end]>=Key){
                    end--;
                }
                arr[begin]=arr[end];
                while (begin<end&&arr[begin]<=Key)
                    begin++;
                arr[end]=arr[begin];
            }
            arr[begin]=Key;
            return begin;
        }


        public static void quickSort(int arr[],int begin,int end){
            if(begin>=end)
                return;
            int key=partition(arr,begin,end);
            quickSort(arr,begin,key-1);
            quickSort(arr,key+1,end);

        }

        public static void sort(int[] arr){
            if(arr==null||arr.length==0)
                return;
            quickSort(arr,0,arr.length-1);
        }
    }


    //下面是普通的快速排序
    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static int partition(int[] arr,int begin,int end){
        int Key=arr[begin];
        int keyPointer=begin;
        while(begin<end){
            while(begin<end&&arr[end]>=Key){
                end--;
            }
            while (begin<end&&arr[begin]<=Key)
                begin++;
            swap(arr,begin,end);
        }
        swap(arr,keyPointer,begin);
        return begin;
    }


    public static void quickSort(int arr[],int begin,int end){
        if(begin>=end)
            return;
        int key=partition(arr,begin,end);
        quickSort(arr,begin,key-1);
        quickSort(arr,key+1,end);

    }

    public static void sort(int[] arr){
        if(arr==null||arr.length==0)
            return;
        quickSort(arr,0,arr.length-1);
    }

    public static void main(String[] args){
        Random ra=new Random();
        int[] res = new int[10];
        for (int i=0;i<10;i++){
            res[i]=ra.nextInt(100);
        }
        for(int i=0;i<10;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println("");
        QuickSort2.sort(res);
        for(int i=0;i<10;i++){
            System.out.print(res[i]+" ");
        }
    }
}
