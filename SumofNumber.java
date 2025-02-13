/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class SumofNumber
{
	public static void main(String[] args) {
		int number = 123456;
		int Oddsum=0;
		int Evensum=0;
		int primesum=0;
		while(number>0)
		{
		    int split=number%10;
		    number=number/10;
		    if(split%2==1)
		    {
		        Oddsum=Oddsum+split;
		    }else{
		        Evensum=Evensum+split;
		    }
		    if(checkprime(split))
		    {
		        primesum=primesum+split;
		    }
		}System.out.println("\nOddsum "+Oddsum+"\nEvensum "+ Evensum + "\nprimesum"+primesum);
	}
	static boolean checkprime(int number)
	{
	    int count=0;
	    for(int i=1;i<=number;i++)
	    {
	        if(number%i==0)
	        count++;
	    }
	    if(count==2)
	    {
	        return true;
	    }
	    return false;
	}
}