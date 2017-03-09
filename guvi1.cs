using System;
using System.Collections.Generic;
using System.Linq;
			
public class Program
{
  public static void Main()
  {
    //Console.WriteLine("Hello C#");
    int n=Convert.ToInt32(Console.ReadLine());
    
    if(n>0)
      Console.WriteLine("positive");
    else if(n<0)
      Console.WriteLine("negative");
      else
      Console.WriteLine("zero");

  }
}
