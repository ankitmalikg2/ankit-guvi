using System;
using System.Collections.Generic;
using System.Linq;
			
public class Program
{
  public static void Main()
  {
    //Console.WriteLine("Hello C#");
     char c=Console.ReadLine()[0];
     if(c=='a'|| c=='e'|| c=='i'||c=='o'|| c=='u')
       Console.WriteLine("vowel");
    else
      Console.WriteLine("consonent");
  }
}
