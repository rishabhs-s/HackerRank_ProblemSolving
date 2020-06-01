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
            int q=sc.nextInt();//no. of queries/testcase
            for (int i=0;i<q;i++)
            {
                int n=sc.nextInt();
                int height=1;
                for(int j=0;j<n;j++){
                if(j%2==0)
                height*=2;
                else
                height++;
                }
                 System.out.println(height);
            }
        
    }
}
    
