package Sorting;

import IO.NormalInput;

import java.util.ArrayList;
import java.util.Arrays;

public class SortRunner {
    public static void main(String[] args) {
        int a[] = NormalInput.nextInts();
        ArrayList<SortHelper> options=constructAllSort();
        System.out.println("Choose an option from below");
        for (int i = 0; i < options.size(); i++) {
            System.out.println(i + 1 + " " + options.get(i));
        }
        System.out.println(options.size()+1+" Verify all sorts");
        int option = NormalInput.nextInt();
        if(option<0 || option>options.size()+1){
            System.out.println("Invalid option selected");
        }else if(option==options.size()+1){
            runAllSort(options,a);
        }else runSort(options.get(option-1),a);

    }
    public static void runAllSort(ArrayList<SortHelper> types,int a[]){
        boolean correctSort=true;
        SortHelper errorType=null;
        int b[]=a.clone();
        Arrays.sort(b);
        boolean alreadySorted=true;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                alreadySorted=false;
                break;
            }
        }

        for(SortHelper type:types){
            correctSort=correctSort&&type.verifySort(a.clone());
            if(!correctSort){
                errorType=type;
                break;
            }
        }
        System.out.println("Running all types of sort returned:"+correctSort+(correctSort?"":"\nFailed sort:"+errorType));
        System.out.println(alreadySorted?"Entered array was already sorted..Verifying the sort may be ambiguous!!":"Done...Exiting!!");

    }

    public static void runSort(SortHelper type, int a[]) {
        type.overridePrintFlag(true);
        if (type == null) {
            System.out.println("Not yet implemented");
            return;
        }
        int b[]=a.clone();
        Arrays.sort(b);
        boolean alreadySorted=true;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                alreadySorted=false;
                break;
            }
        }
        System.out.println("Verify Sort:" + type.verifySort(a));
        System.out.println(alreadySorted?"Entered array was already sorted..Verifying the sort may be ambiguous!!":"Done...Exiting!!");
    }
    public static ArrayList<SortHelper> constructAllSort(){
        ArrayList<SortHelper> sorts=new ArrayList<>();
        sorts.add(new SelectionSort(false));
        sorts.add(new BubbleSort(false));
        sorts.add(new RecursiveBubbleSort(false));
        sorts.add(new InsertionSort(false));
        sorts.add(new MergeSort(false));
        //sorts.add(new IterativeMergeSort(false));
        sorts.add(new QuickSort(false));
        sorts.add(new HeapSort(false));
        return sorts;
    }
}

