import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scan.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        int sum = 0;
        int num = x;
        for (int i = 1; i <= n; i++) {
            if(i == 1){
                sum += x;
            }
            else {
                x = ((x * 10) + num);
                sum += x;
            }
        }
        System.out.println("Sum is "+ sum);
    }
}