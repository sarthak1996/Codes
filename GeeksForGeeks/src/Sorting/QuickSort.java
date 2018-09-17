package Sorting;

public class QuickSort extends SortHelper {
    public QuickSort(){};
    public QuickSort(boolean printFlag){
        this.printFlag=printFlag;
    }

    @Override
    public boolean sort(int[] a) {
        quickSort(a,0,a.length);
        return printFlag;
    }

    public void quickSort(int a[],int start,int end){
        if(start<end){
            int pivotCorrect=partition(a,start,end,end-1);
            quickSort(a,start,pivotCorrect);
            quickSort(a,pivotCorrect+1,end);
        }
    }

    public int partition(int a[],int start,int end,int pivotIndex){
        int pivot=a[pivotIndex];
        int i=start;

        for(int j=start;j<end-1;j++){
            if(a[j]<=pivot){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        int temp=a[i];
        a[i]=a[pivotIndex];
        a[pivotIndex]=temp;
        return i;
    }

    @Override
    public String toString() {
        return "Quick";
    }


}
