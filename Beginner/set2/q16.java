/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set2;
import java.util.*;

public class q16 {
    
    static boolean isPrime(int n)
    {
        boolean b=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                b=false;
                break;
            }
        }
        
        return b;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int last=sc.nextInt();
        //if(first%2==0)first=first+1;
        
        System.out.println();
        for(int i=first;i<=last;i++)
        {
            if(isPrime(i))
            System.out.println(i);
        }
    }
}
