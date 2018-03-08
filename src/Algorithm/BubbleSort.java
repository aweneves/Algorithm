package Algorithm;

public class BubbleSort {
    public static void bubbleSort(int[] a){
        int len = a.length;
        for(int i=len-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] a = {3,1,5,7,2,4,9,6,10,8};
        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(a);
        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
