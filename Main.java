import java.util.*;
class College
{
    void display() {
		System.out.println("Hindusthan college of Engineering And Technology");
	}
}
class Depts extends College
{
    String dept="CSE";
    Depts()
    {
        super();
    }
    void disp1(){
        System.out.println("DEPARTMENT :"+dept);
    }
}
class Student extends Depts{
    String sname="ROHIT";
    void show()
    {
        System.out.println("NAME :"+sname);
    }
}
class Main{
    public static void main(String args[]){
        //College obj=new College();
        Depts obj1=new Depts();
        obj1.display();
        obj1.disp1();
        Student obj2=new Student();
        obj2.show();
       // obj.display();
    }
}