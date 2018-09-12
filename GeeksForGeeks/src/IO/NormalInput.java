package IO;

import java.util.Scanner;

public class NormalInput {
    private static Scanner sc = new Scanner(System.in);

    /**
     *
     * @return Returns one integer
     */
    public static int nextInt(){
        return sc.nextInt();
    }
    /**
     *
     * @return Returns a line
     */
    public static String nextString(){
        return sc.nextLine();
    }
    /**
     *
     * @return Returns one word
     */
    public static String nextWord(){
        return sc.next();
    }
    /**
     *
     * @return Returns array of words in a line
     */
    public static String[] nextWords(){
        return nextString().split(" ");
    }
    /**
     *
     * @return Returns array of integers in a string
     */
    public static int[] nextInts(){
        String []s=nextWords();
        int n=s.length;
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        return a;
    }
    /**
     *
     * @return Returns one long
     */
    public static long nextLong(){
        return sc.nextLong();
    }
    /**
     *
     * @return Returns array of longs
     */
    public static long[] nextLongs(){
        String []s=nextWords();
        int n=s.length;
        long a[]=new long[n];
        for (int i=0;i<n;i++){
            a[i]=Long.parseLong(s[i]);
        }
        return a;
    }
}
