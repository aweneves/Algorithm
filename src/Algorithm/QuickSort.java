package Algorithm;

public class QuickSort {
    public static void quickSort(int[] a, int left, int right){
        if(left>=right){
            return;
        }
        int idx = partition(a, left, right);
        quickSort(a, left, idx-1);
        quickSort(a, idx+1, right);
    }

    public static int partition(int[] a, int left, int right){
        int lPtr = left-1;
        int rPtr = right;
        int val = a[right];
        while(lPtr<rPtr) {
            while (a[++lPtr] <= val && lPtr < rPtr) ;
            while (a[--rPtr] >= val && lPtr < rPtr) ;
            if(lPtr>=rPtr){
                break;
            }
            swap(a, lPtr, rPtr);
        }
        swap(a, lPtr, right);
        return rPtr;

    }

    public static void swap(int[] a, int lPtr, int rPtr){
        int temp = a[lPtr];
        a[lPtr] = a[rPtr];
        a[rPtr] = temp;
    }

    public static void main(String[] args){
        int[] a = {3,1,5,7,2,4,9,6,10,8,5,4,3,2};
        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(a, 0, a.length-1);
        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
