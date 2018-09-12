package Searching;
/*
https://www.geeksforgeeks.org/jump-search/
O(√n)
 */
public class JumpSearch extends SearchHelper{
    @Override
    public int search(int[] a, int k) {
        int n=a.length-1;
        int m=(int)Math.sqrt(n);
        int step=m;
        while(a[Math.min(m,n)]<k){
            if(m>=n){
                return -1;
            }
            m+=step;
        }

        for(int i=m-step;i<=Math.min(m,n);i++){
            if(a[i]==k){
                return i;
            }
        }
        return -1;
    }
}
