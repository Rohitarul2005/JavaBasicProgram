import java.util.*;
class NumberCheck {
	public static void pronic(int n) {
		int z=n;
		boolean flag=false;
		for(int i=1; i<n; i++)
		{
			if(n==i*(i+1))
				flag=true;

		}
		if(flag)
			System.out.println("It is Pronic number");
		else {
			System.out.println("It is Not a Pronic Number");
		}
	}
	public static void abundant(int n) {
		int y=n;
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum>n) {
			System.out.println("It is Abundant Number");
		}
		else {
			System.out.println("It is Not an Abundant Number");
		}

	}
	public static void niven(int n) {
		int x = n;
		int rev=0;
		int sum=0;
		while(x>0) {
			rev=x%10;
			sum+=rev;
			x=x/10;
		}
		if(n%sum==0) {
			System.out.println("It is Niven Number");
		}
		else {
			System.out.println("It is Not a Niven Number");
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter a Number");
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		NumberCheck obj=new NumberCheck();
		obj.pronic(n);
		obj.niven(n);
		obj.abundant(n);
	}

}
