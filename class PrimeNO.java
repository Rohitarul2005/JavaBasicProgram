 import java.util.*;
 public class PrimeNO
{
	public static void main(String[] args)
	{
	   int n=9;
       if (n <= 1)
        {
        System.out.println(n+ " is Not Prime");
        } 
    else {
        int count=0;
	   for (int i=2;i<=n;i++)
	   {
	   if(n % i==0)
	   count ++;
	   }
	   if(count == 2)
	   {
	       System.out.println("It is a prime number");
	   }
	   else
	   {
	       System.out.printl("It is not a prime number");
	   }
   }
}
}


