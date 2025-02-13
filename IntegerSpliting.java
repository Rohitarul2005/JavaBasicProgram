
public class IntegerSpliting
{
	public static void main(String[] args) {
		int number = 123456;
		int Oddsum=0;
		int Evensum=0 ,Evensum1=0;
		int primesum=0,primesum1=0;
		int Oddsum1=0;
		int ten=1,ten1=1,ten2=1;
		while(number>0)
		{ 
		    int split=number%10;
		    number=number/10;
		    if(split%2==1)
		    {
		        Oddsum=(Oddsum*10)+split;
		        Oddsum1=Oddsum1+(split*ten);
		        ten=ten*10;
		    }else{
		        Evensum=(Evensum*10)+split;
		        Evensum1=Evensum1+(split*ten1);
		        ten1=ten1*10;
		        
		    }
		    if(checkprime(split))
		    {
		        primesum=(primesum*10)+split;
		        primesum1=primesum1+(split*ten2);
		        ten2=ten2*10;
		    }
		}System.out.println("\nOddsum1: " + Oddsum1 +"\nEvensum1: " + Evensum1 +"\nprimesum1: " +primesum1);
		System.out.println("\nOddRev: "+Oddsum+"\nEvenRev: "+ Evensum + "\nprimeRev: "+primesum);
	
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
