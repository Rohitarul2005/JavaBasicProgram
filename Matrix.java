import java.util.*;
class Matrix {
    public static void main(String[] args) {
        System.out.println("Enter the Matrix Value");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
         } System.out.println();
    }
}
}