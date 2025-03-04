import java.util.*;
class Substring
{
    static void string(){
        System.out.println("Enter a string");
		Scanner in =new Scanner(System.in);
		String s=in.nextLine();
		int n=s.length();
		String ss=s.substring(3,n-1);
		System.out.println("Substring : "+ss );
		
		
    }
    static void stringbuild(){
        
        System.out.println("\nEnter a String for StringBuilder :");
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
		int n=s.length();
		StringBuilder s1=new StringBuilder(s);
		System.out.println("The substring of StringBuilder : "+s1.substring(3,n-1));
		
        
    }
    static void stringbuf(){
        System.out.println("\nEnter a String for StringBuffer :");
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
		int n=s.length();
		StringBuffer s2= new StringBuffer(s);
		System.out.println("SubString of StringBuffer : "+s2.substring(3,n-1));
		
        
    }
	public static void main(String[] args) {
		string();
		stringbuild();
		stringbuf();
	}
}