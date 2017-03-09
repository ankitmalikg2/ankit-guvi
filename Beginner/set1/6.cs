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
    
    if(n%100==0)
    {
      if(n%400==0)
        Console.WriteLine("Leap year");
      else
        Console.WriteLine("not leap year");
    }
    else
    {
      if(n%4==0)
        Console.WriteLine("Leap year");
      else
        Console.WriteLine("not leap year");
    }
    
    //Console.WriteLine();
    
  }
}
