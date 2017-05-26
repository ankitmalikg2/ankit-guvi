/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set2;
import java.util.*;
/**
 *
 * @author ankit
 */
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int r=0;
        while(m>0){
            r=r*10+m%10;
            m=m/10;
        }
        System.out.println((r==n)?"Palindrome":"Not Palindrome");
    }
    
}
