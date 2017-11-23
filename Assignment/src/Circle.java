
public class Circle {

	float r;
	float d;

	
	float Radius(int r)
	{
		return (3.14f)*r*r;
	}
	
	float Diameter(int d)
	{
		return (3.14f*d*d)/4;
	}
	
	float Perimeter(int r)
	{
		return 2*(3.14f)*r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle a1= new Circle();
		System.out.println("Area of the circle with radius is : " +a1.Radius(10));
		System.out.println("Area of the circle with diameter is : " +a1.Diameter(20));
		System.out.println("Perimeter of circle is : " +a1.Perimeter(10));
		
	}
}
