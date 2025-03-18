import java .util.*;
class BubbleSort
{
	public static void main(String[] args) {
		System.out.println("Bubble sort Algorithm");
		Scanner in =new Scanner(System.in);
		int size=in.nextInt();
		int []a=new int[size];
		for(int i=0;i<size;i++){
		    a[i]=in.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(a[i]>a[j]){
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		        
		    }
		}
		System.out.println("Sorted Array\n"+Arrays.toString(a));
	}
}