package Sorting;

import java.util.Arrays;

public abstract class SortHelper {
    protected boolean printFlag=true;
    public abstract boolean sort(int []a);

    public boolean verifySort(int a[]){
        boolean printFlag=sort(a);
        if(printFlag) {
            System.out.print("Sorted Array: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        int b[]=a.clone();
        Arrays.sort(b);

        for (int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    protected void overridePrintFlag(boolean printFlag){
        this.printFlag=printFlag;
    }

    protected boolean getPrintFlag(){
        return this.printFlag;
    }
}
