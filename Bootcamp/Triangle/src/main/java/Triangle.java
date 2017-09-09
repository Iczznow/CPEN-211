import java.util.ArrayList;

public class Triangle implements Shape {
	private double x1, y1, x2, y2, x3, y3;
	//we call x1, y1, etc. fields or instance variables
	//and collectively they are the "representation" of the triangle
	
	//our constructor
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		//we have to distinguish the x1 being passed to the
		//from the x1 that is a field.
		//this.x1 is the field x1. 
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.x3=x3;
		this.y3=y3;
		assert(this.area() > 0); //scream if not a triangle
	}
	
	public double area() {
		double area = ((x1-x3)*(y2-y1)-(x1-x2)*(y3-y1))/2;
		if (area < 0)
			area = -area;
		return area;
	}
	
	public static void main(String[] args) {
		ArrayList<Shape> ShapeList = new ArrayList<Shape>();
		//first initializes ShapeList
		//points array to newArrayList<Shape>();
		Triangle t= new Triangle (1,1,2,2,0,3);
		ShapeList.add(t);
		t = new Triangle(1, 4,5, 4, 1, 6);
		System.out.println(t);
		ShapeList.add(t);
		double totalArea = 0;
		
		for(Shape x : ShapeList) {
			totalArea += x.area();
		}
		
		System.out.println("This area of our triangle is " + totalArea);
	}
}
