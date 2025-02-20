import java.util.Scanner;

class Studentinfo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         Student  a[]=new Student[5];
        for(int i=0;i<5;i++){
        a[i]=new Student();
        System.out.println("Enter your Name:");
        String name = in.nextLine();
        
        System.out.println("Enter your RegNo:");
        int regNo = in.nextInt();
        in.nextLine();
        a[i].studentDetail(name, regNo);
        }
         in.close();
    }
}

class Student {
    String name;
    int regNo;
    
    void studentDetail(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
        System.out.println("\nNAME: " + name);
        System.out.println("REG_NO: " + regNo);
    }
}
