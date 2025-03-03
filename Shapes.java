class Shape {
	void area() {
		System.out.println("Area of Shape");
	}
}
class Rectangle extends Shape {
	double area;
	Rectangle(double l,double b) {
		this.area=l*b;
	}
	void area() {
        super.area();
		System.out.println("Area of Rectangle: "+area);
	}
}
class Triangle extends Shape{
    double area;
    Triangle(double h,double b){
        area=0.5*(b*h);
    }
    void area(){
        System.out.println("Area of Triangle: "+area);
    }
}
class Square extends Shape{
    double area;
    Square(double a){
        area=a*a;
    }
    void area(){
        System.out.println("Area of Square: "+area);
    }
}
class Circle extends Shape{
    double area;
    Circle(double r){
        area=3.14*r*r;
    }
    void area(){
        System.out.println("Area of Circle: "+area);
    }
}
class Main{
	public static void main(String args[]) {
		Rectangle obj1=new Rectangle(14.94,15);
		Triangle obj2=new Triangle(10,15);
		Square obj3=new Square(10);
		Circle obj4=new Circle(4);
		obj1.area();
		obj2.area();
		obj3.area();
		obj4.area();
	}
}