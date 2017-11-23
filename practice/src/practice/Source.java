package practice;

import java.util.ArrayList;

public class Source {
	public static void main(String[] args)
	{
		ArrayList<Item> items= new ArrayList<>();
		
		items.add(new Item(103, "Iphone", 200));
		items.add(new Item(104, "Samsung", 210));
		items.add(new Item(101, "Nokia", 100));
		items.add(new Item(102, "Blackberry", 250));
	}

}
