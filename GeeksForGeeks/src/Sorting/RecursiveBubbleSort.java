package Sorting;

public class RecursiveBubbleSort extends SortHelper {

    public RecursiveBubbleSort(boolean printFlag){
        this.printFlag=printFlag;
    }

    public RecursiveBubbleSort() {
        this.printFlag=true;
    }

    @Override
    public boolean sort(int[] a) {
        bubbleSort(a,a.length);
        return printFlag;
    }

    public void bubbleSort(int []a,int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        bubbleSort(a,n-1);
    }

    @Override
    public String toString() {
        return "Recursive Bubble";
    }
}
