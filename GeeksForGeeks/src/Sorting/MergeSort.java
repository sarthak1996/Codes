package Sorting;

import java.util.Arrays;

public class MergeSort extends SortHelper {
    public MergeSort(boolean printFlag){
        this.printFlag=printFlag;
    }

    public MergeSort() {
        this.printFlag=true;
    }

    @Override
    public boolean sort(int[] a) {
        mergeSort(a,0,a.length-1);
        return printFlag;
    }

    public void mergeSort(int a[],int start,int end){
        if(start==end){
            return;
        }
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }

    public void merge(int a[],int start,int mid,int end){
        int L[]=new int[mid-start+1];
        int R[]=new int[end-mid];
        for(int i=0;i<L.length;i++){
            L[i]=a[i+start];
        }
        for(int i=0;i<R.length;i++){
            R[i]=a[mid+i+1];
        }

        int idx_r=0,idx_l=0,idx=start;
        for(;idx_r<R.length && idx_l<L.length;){
            if(L[idx_l]<R[idx_r]){
                a[idx++]=L[idx_l++];
            }else{
                a[idx++]=R[idx_r++];
            }
        }
        while(idx_l<L.length){
            a[idx++]=L[idx_l++];
        }
        while (idx_r<R.length){
            a[idx++]=R[idx_r++];
        }
        //System.out.println("Left:"+ Arrays.toString(L)+" Right:"+Arrays.toString(R));

    }

    @Override
    public String toString() {
        return "Merge";
    }
}
