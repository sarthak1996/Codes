package Searching;

import IO.NormalInput;


/*
* Helper class to run all search algorithms
* */
public class SearchRunner {
    public static void main(String[] args) {
        int a[]= NormalInput.nextInts();
        int k=NormalInput.nextInt();
        String options[]={"Linear","Binary","Jump"};
        System.out.println("Choose an option from below");
        for(int i=0;i<options.length;i++){
            System.out.println(i+1+" "+options[i]);
        }
        int option = NormalInput.nextInt();
        switch (option){
            case 1:
                System.out.println("Index of "+k+" is:"+new LinearSearch().validateAndSearch(a,k));
                break;
            case 2:
                System.out.println("Index of "+k+" is:"+new BinarySearch().validateAndSearch(a,k));
                break;
            case 3:
                System.out.println("Index of "+k+" is:"+new JumpSearch().validateAndSearch(a,k));
                break;
            default:
                System.out.println("Invalid option selected.Exiting!!");

        }
    }
}
