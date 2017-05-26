/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set2;
import java.util.*;
import static set2.q16.isPrime;

public class q18 {
    static boolean isArmStrong(int n)
    {
        int m=n;
        int a=0;
        int count=0;
        
        while(m>0)
        {
            count++;
            m=m/10;            
        }
        
        m=n;
        while(m>0)
        {
            a=a+(int)Math.pow(m%10, count);
            m=m/10;
        }
        
       if(a==n)return true;
       else return false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int last=sc.nextInt();
        //if(first%2==0)first=first+1;
        
        System.out.println();
        for(int i=first;i<=last;i++)
        {
            if(isArmStrong(i))
            System.out.println(i);
        }
    }
    
}
