package Sorting;

public class IterativeMergeSort extends SortHelper {
    @Override
    public boolean sort(int[] a) {

        return printFlag;
    }

    public IterativeMergeSort() {
        this.printFlag=true;
    }
    public IterativeMergeSort(boolean printFlag) {
        this.printFlag=printFlag;
    }

    @Override
    public String toString() {
        return "Iterative Merge";
    }
}
