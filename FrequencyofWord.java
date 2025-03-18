import java .util.*;
class FrequencyofWord
{
	public static void main(String[] args) {
		System.out.println("Frequency of Word");
		Scanner in =new Scanner (System.in);
		String a = in.nextLine();
		String word[] = a.toLowerCase().split(" ");
		int n = word.length;
		boolean visited[]=new boolean[n];
		int count=0;
		for(int i=0; i<n; i++) {
			if(!visited[i]) {
				count = 1;
				for(int j=i+1; j<n; j++) {
					if(word[i].equals(word[j])){
						count++;
					visited[j]=true;
				    }
                }
			System.out.println(word[i]+" :"+count);
			}
		}
	}
}
