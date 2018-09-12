package Sorting;

public class BubbleSort extends SortHelper {

    public BubbleSort(boolean printFlag){
        this.printFlag=printFlag;
    }

    public BubbleSort() {
        this.printFlag=true;
    }

    @Override
    public boolean sort(int[] a) {
        boolean swapped=false;
        for (int i=0;i<a.length;i++){
            swapped=false;
            for(int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                return printFlag;
            }
        }
        return printFlag;
    }

    @Override
    public String toString() {
        return "Bubble";
    }
}
