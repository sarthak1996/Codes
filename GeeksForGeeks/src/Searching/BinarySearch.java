package Searching;
/*
https://www.geeksforgeeks.org/binary-search/
ø(log(n))
 */
public class BinarySearch extends SearchHelper {
    public int binarySearch(int a[],int start,int end,int k){
        if (a[start]==k)
            return start;
        int mid=(start+end)/2;
        if (a[mid]<k)
            return binarySearch(a,mid+1,end,k);
        else
            return binarySearch(a,start,mid,k);
    }

    @Override
    public int search(int[] a, int k) {
        return binarySearch(a,0,a.length-1,k);
    }
}

