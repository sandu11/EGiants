package Inheritance;

class Parent
{
	int x;
	Parent ()
	{
		System.out.println("parent default");
		x=10;
		
	}
	void putX()
	{
		System.out.println("x="+x);
	}
}
class Child extends Parent
{
	int y;
	Child(){
		System.out.println("Child default");
		y=20;
	}
	void m1(){
		System.out.println("child m1");
		y=40;
	}
	void display(){
		putX();
		System.out.println("y="+y);
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.putX();
		Child c=new Child();
		c.display();
		c.m1();
		c.display();
		Parent p1=new Child();
		p1.putX();
	}

}
