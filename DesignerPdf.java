import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[26];
        for(int i=0;i<26;i++)
        {
            arr[i]=sc.nextInt();
        }
        String str=sc.next();
        int len=str.length();
        int max=1;
        for(int j=0;j<len;j++)
        {
        char ch=str.charAt(j);
        if (max<arr[ch-97])
        {
            max=arr[ch-97];
        }
        else
        {
         max = max;
        }
        }
        int x=str.length();
        System.out.println(max*str.length()); 
    }
}
        

