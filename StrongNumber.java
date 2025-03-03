import java.util.*;
public class StrongNumber
{
	public static void main(String[] args) {
		System.out.println("Enter a any to check for strong Number");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int x=n;
		int rev=0;
		int sum=0;
		while(n>0) {
			rev=n%10;
			n=n/10;
			    //System.out.println(rev);
			int res=1;
			for(int i=rev; i>0; i--) {
				res*=i;
				// System.out.println(res);
			}
			sum+= res;
		}
		System.out.println("sum :"+sum);
		if(sum==x) {
			System.out.println("It is strong Number");
		}
		else {
			System.out.println("it is not a Strong Number");
		}
	}
}