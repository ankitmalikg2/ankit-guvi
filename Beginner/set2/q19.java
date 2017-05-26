/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set2;
import java.util.*;

public class q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        for(int i=2;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}
