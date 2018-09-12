package Searching;

public abstract class SearchHelper {
    public abstract int search(int [] a,int k);
    public boolean validate(int []a){
        for (int i=0;i<a.length;i++){
            if(search(a,a[i])<0){
                return false;
            }
        }
        return true;
    }
    public int validateAndSearch(int a[],int k) {
        System.out.println("Validate Search returned:" + validate(a));
        return search(a, k);
    }
}
