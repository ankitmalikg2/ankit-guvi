using System;
using System.Collections.Generic;
using System.Linq;
using System.Globalization;
using System.Numerics;
			
public class Program
{
  public static void Main()
  {
    //Console.WriteLine("Hello C#");
    int n=Convert.ToInt32(Console.ReadLine());
    
    int sum=0;
    while(n!=0)
    {
      sum++;
      n=n/10;
    }
    
    Console.WriteLine(sum);
    
  }
}
