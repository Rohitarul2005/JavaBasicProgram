import java.util.*;
class wordRev
{
	public static void main(String[] args) {
		String s ="I love   Java    Programming";
		StringBuilder r = new StringBuilder();
		String[] words=s.split("\\s+");
        for ( int i=words.length-1;i>=0;i--){
            r.append(words[i]).append(" ");
            
        }
		System.out.println(r.toString().trim());
		
	}
}