using System;
using System.Collections.Generic;
using System.Linq;
			
public class Program
{
  public static void Main()
  {
   // Console.WriteLine("Hello C#");
    
    char c=Console.ReadLine()[0];
     if(char.IsLetter(c))
       Console.WriteLine("alphabet");
    else
      Console.WriteLine("not");
  }
}
