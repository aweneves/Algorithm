package Algorithm;

public class SelectSort {
    public static void selectSort(int[] a){
        int len = a.length;
        for(int i=0; i<len-1; i++){
            int idx = i;
            for(int j=i+1; j<len; j++){
                if(a[j]<a[i]){
//                    idx = j;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
//            if(idx!=i) {
//                int temp = a[i];
//                a[i] = a[idx];
//                a[idx] = temp;
//            }
        }
    }

    public static void main(String[] args){
        int[] a = {3,1,5,7,2,4,9,6,10,8};
        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        selectSort(a);
        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
