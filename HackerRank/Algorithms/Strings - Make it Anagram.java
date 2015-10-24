import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        String a = in.nextLine();
        String b = in.nextLine();
        
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        
        for(int i=0; i<a.length(); i++){
            if(!ht.containsKey(a.charAt(i))){
                ht.put(a.charAt(i), 1);
            }else{
                ht.put(a.charAt(i), ht.get(a.charAt(i))+1);
            }        
        }
       //System.out.println(ht);
        int count =0;
        for(int j=0; j<b.length(); j++){
            if(!ht.containsKey(b.charAt(j))){
                count++;
            }else{
                //if(ht.get(b.charAt(j))-1 != 0){
                    ht.put(b.charAt(j), ht.get(b.charAt(j))-1);
                //}
            }
        }
       //System.out.println(ht);
        for(int x: ht.values()){
            count = count + Math.abs(x);
        }
        System.out.println(count);
        
    }
}