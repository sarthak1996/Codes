package Sorting;

public class HeapSort extends SortHelper {
    @Override
    public boolean sort(int[] a) {
        heapSort(a,a.length);
        return printFlag;
    }

    @Override
    public String toString() {
        return "Heap";
    }

    public HeapSort() {
    }
    public HeapSort(boolean printFlag) {
        this.printFlag=printFlag;
    }

    private int getRightChild(int i){
        return (2*i)+2;
    }

    private int getLeftChild(int i){
        return (2*i)+1;
    }

    private void heapify(int a[],int n,int root_idx){
        int max_index=root_idx;
        int left_child=getLeftChild(root_idx);
        int right_child=getRightChild(root_idx);

        if(left_child<n && a[left_child]>a[max_index]){
            max_index=left_child;
        }

        if(right_child<n && a[right_child]>a[max_index]){
            max_index=right_child;
        }

        if(max_index!=root_idx){
            int temp=a[max_index];
            a[max_index]=a[root_idx];
            a[root_idx]=temp;
            heapify(a,n,max_index);
        }

    }

    private void buildMaxHeap(int a[],int n){
        for(int i=(n/2)-1;i>=0;i--){
            heapify(a,n,i);
        }
    }

    private void heapSort(int a[],int n){
        buildMaxHeap(a,n);
        for (int i=n-1;i>=0;i--){
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapify(a,i,0);
        }
    }

}
