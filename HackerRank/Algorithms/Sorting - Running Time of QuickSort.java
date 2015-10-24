import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int shifts = 0;
    static int shifts2 = 0;
   public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //ok lets try this again maybe...
        //hmmm
        //think
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] ar = new int[t];
        for(int i=0; i<t; i++){
            ar[i] = in.nextInt();
        }
       int[] ar2 = Arrays.copyOf(ar, t);
        quicksort(ar, 0, t-1);
       //System.out.println("The number of shifts in quick sort is " + shifts);
       insertionSortPart2(ar2);
      // System.out.println("The number of shifts in insertion sort is " + shifts2);
       System.out.println(shifts2-shifts);
       
    }
    
    public static void quicksort(int[] ar, int low, int high){
        if(low<high){
            int p = partition(ar, low, high);
            quicksort(ar, low, p-1);
            quicksort(ar, p+1, high);
        }
    }
    
    public static int partition(int[] ar, int low, int high){
       // System.out.println("looking at values from " + low + " to " + high);
        int pivot = ar[high];
        int ii = low;
        for(int j=low; j<=high-1; j++){
            if(ar[j]<=pivot){
                //swap ar[i] with ar[j];
                int temp = ar[ii];
                ar[ii] = ar[j];
                ar[j] = temp;
                ii++;
                shifts++;
            }
        }
        int temp2 = ar[high];
        ar[high] = ar[ii];
        ar[ii] = temp2;
        shifts++;
       // printArray(ar);
        return ii;
    }
    
    public static void insertionSortPart2(int[] ar){       

        //wow... this implementation is much much better than mine. Im no where. i dont even know how to do this shit.
        for(int i=1; i<ar.length; i++){
            int temp = ar[i];
            for(int j=i-1; j>=0 && temp<ar[j]; j--){
                ar[j+1] = ar[j];
                ar[j]=temp;
                shifts2++;
            }
            //printArray(ar);   
        }     
    }
    
    static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
}