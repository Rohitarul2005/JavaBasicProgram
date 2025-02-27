
import java.util.*;
public class AutomorphicNumber
{
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner in = new Scanner(System.in);
		long n=in.nextInt();
		long sq=n*n;
		long num=0;
		long ten=1;
		boolean flag=false;
		while(sq>0){
		long rev=sq%10;
		num=(rev*ten)+num;
		sq=sq/10;
		ten=ten*10;
		if(num==n) {
			flag=true;
		}
		}
		if(flag){
		    System.out.println("It is Automorphic Number");
		}
		else{
		    System.out.println("It is not an automorphic number");
		}
	}
}
