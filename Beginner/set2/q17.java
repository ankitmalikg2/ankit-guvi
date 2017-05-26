/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set2;
import java.util.*;

public class q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
        
        System.out.println((a==n)?"Amstrong":"Not Armstrong");
       
    }
}
