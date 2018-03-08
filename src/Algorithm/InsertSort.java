package Algorithm;

public class InsertSort {
    public static void insertSort(int[] a){
        int len = a.length;
        for(int i=1; i<len; i++){
            int temp = a[i];
            int j = i;
            while(j>0&&a[j-1]>temp){
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
//            if(idx!=i) {
//                int temp = a[i];
//                a[i] = a[idx];
//                a[idx] = temp;
//            }
        }
    }

    public static void main(String[] args){
        int[] a = {3,1,5,7,2,4,9,6,10,8,5,5,5,5,5,5,4,3,3,3,2,2,2,2};
        //3,1,5,7,2,4,9,6,10,8
        //1,3,5,7,2,4,9,6,10,8
        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        insertSort(a);
        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
