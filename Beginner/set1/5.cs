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
    int a=Convert.ToInt32(Console.ReadLine());
    int b=Convert.ToInt32(Console.ReadLine());
    int c=Convert.ToInt32(Console.ReadLine());
    
    int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
    Console.WriteLine();
    Console.WriteLine(max);
    
  }
}
