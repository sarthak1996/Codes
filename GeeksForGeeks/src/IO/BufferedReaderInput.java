package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    /*
    * Every method in this class reads a complete line
    * Even if one int is read from System.in the complete line would be lost.
    * */

    /**
     *
     * @return Returns one integer
     */
    public static int nextInt() throws IOException {
        return Integer.parseInt(nextString());
    }
    /**
     *
     * @return Returns a line
     */
    public static String nextString() throws IOException{
        return br.readLine();
    }

    /**
     *
     * @return Returns array of words in a line
     */
    public static String[] nextWords() throws IOException{
        return nextString().split(" ");
    }
    /**
     *
     * @return Returns array of integers in a string
     */
    public static int[] nextInts() throws IOException{
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
    public static long nextLong() throws IOException{
        return Long.parseLong(nextString());
    }
    /**
     *
     * @return Returns array of longs
     */
    public static long[] nextLongs() throws IOException{
        String []s=nextWords();
        int n=s.length;
        long a[]=new long[n];
        for (int i=0;i<n;i++){
            a[i]=Long.parseLong(s[i]);
        }
        return a;
    }

}
