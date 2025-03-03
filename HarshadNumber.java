import java.util.*;
class HarshadNumber {
	public static void main(String args[]) {
		System.out.println("Enter a Number");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int x=n;
		int rev=0;
		int sum=0;
		while(x>0) {
			rev=x%10;
			sum+=rev;
			x=x/10;
		}
		if(n%sum==0) {
			System.out.println("It is Harshad Number");
		}
		else {
			System.out.println("It is not a Harshad Number");
		}

	}
}