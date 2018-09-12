package Sorting;

public class InsertionSort extends SortHelper {
    public InsertionSort() {
    }
    public InsertionSort(boolean printFlag){
        this.printFlag=printFlag;
    }

    @Override
    public boolean sort(int[] a) {
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        return printFlag;
    }
    @Override
    public String toString() {
        return "Insertion";
    }
}
