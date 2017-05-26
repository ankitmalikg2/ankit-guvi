/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set2;
import java.util.*;


public class q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=true;
        for(int i=2;i<=n/2;i++)
        {
           if(n%i==0)
           {
               b=false;
               break;
           }
        }
        
        System.out.println((b)?"Prime":"Not Prime");
        
    }
    
}
