import java.util.*;
class Decimal {
    Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	public void binary(){
	    int z=n;
	    int binary=0;
	    int place=1;
	    while(z>0){
	        int rem=z%2;
	        binary=rem*place+binary;
	        z=z/2;
	        place=place*place;
	    }
	    System.out.println("Decimal to binary :"+binary);
	}
	public void octal() {
	    int y=n;
		int oct=0;
		int place=1;
		while(y>0) {
			int rem=y%8;
			oct=rem*place+oct;
			y=y/8;
			place=place*10;
		}
		System.out.println("Decimal to Octal :"+oct);
	}
	public void hexa() {
	    int x=n;
	    String hexString=Integer.toHexString(x);
	    System.out.println("Decimal to Hexadecimal :"+hexString.toUpperCase());
	
	}
	public static void main(String args[]) {
		Decimal obj = new Decimal();
		obj.hexa();
		obj.octal();
		obj.binary();
	}
}