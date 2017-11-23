
public class Room {

	int length;
	int breadth;
	
	public Room(int l,int b){
		this.length = l;
		this.breadth = b;
	}
	void area(){
		System.out.println("area: "+(this.length * this.breadth));
	}
	
	void perimeter(){
		System.out.println("perimeter: "+2*(this.length + this.breadth));
	}
		
	public static void main(String[] args) {

		Room r = new Room(50,40);
		r.area();
		r.perimeter();

	}

}
