package Searching;

/*
https://www.geeksforgeeks.org/linear-search/
O(n)
*/
public class LinearSearch extends SearchHelper {
    @Override
    public int search(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }

}
