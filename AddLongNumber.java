import java.util.*;
class AddLongNumber
{
	public static void main(String[] args) {
		System.out.println("Add two long Number");
		Scanner in = new Scanner(System.in);
		String n1=in.nextLine();
		String n2=in.nextLine();
		StringBuilder res = new StringBuilder();
		int carry=0;
		int i=n1.length()-1;
		int j=n2.length()-1;
		while(i>=0||j>=0||carry!=0) {
			int digit1 =(i >= 0) ? n1.charAt(i)-'0':0;
			int digit2 =(j >= 0) ? n2.charAt(j)-'0':0;
			int sum=digit1+digit2+carry;
			res.append(sum%10);
			carry=sum/10;
			i--;
			j--;
		}
		System.out.println("Sum of two LongNumber :"+res.reverse());
	}
}