import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        in.nextInt();
        System.out.println("Enter a string");
        for(int i=0;i<n;i++){
        String Name=in.nextLine();
        Main obj=new Main();
        obj.checkpalindrome(Name);
        }
        in.close();
    }
    void checkpalindrome(String Name){
        int left=0;
        int right=Name.length()-1;
        boolean ispalindrome = true;
        while(left<right){
            if(Name.charAt(left)!=Name.charAt(right)){
                ispalindrome=false;
                break;
            }
                 left++;
                 right--;
        }if(ispalindrome){
        System.out.println("The given String is a palindrome");
    }else
    {
        System.out.println("The given String is Not a palindrome");
    }
  }

}

    
