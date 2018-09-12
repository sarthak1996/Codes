package Sorting;

public class SelectionSort extends SortHelper{

    public SelectionSort(boolean printFlag){
        this.printFlag=printFlag;
    }

    public SelectionSort() {
        this.printFlag=true;
    }

    @Override
    public boolean sort(int[] a) {
        for (int i=0;i<a.length-1;i++){
            int min_idx=i;
            for (int j=i+1;j<a.length;j++){
                if(a[min_idx]>a[j]){
                    min_idx=j;
                }
            }
            int temp=a[min_idx];
            a[min_idx]=a[i];
            a[i]=temp;
        }
        return printFlag;
    }

    @Override
    public String toString() {
        return "Selection";
    }
}
