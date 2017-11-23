import java.util.HashMap;
import java.util.Map;

public class Leak {
	public Map cache= new HashMap();
	public int square(int i)
	{
		int result= i*i;
		cache.put(i,result);
		return result;
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int x;
				
		Leak l= new Leak();
		for(int i=0;i<10000;i++)
		{
			System.out.println(+l.square(i));
		}
		

	}

}
