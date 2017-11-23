package sorting;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={9,4,2,5,8};	//given input array
		int temp;				//taken extra variable for swapping
		boolean fixed=false;
		
		while(fixed==false){	//used while loop to sort until all elements are sorted
			fixed=true;			//helps for termination of while loop
			
			for(int i=0;i<a.length-1;i++){	//swapping procedure using for loop
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					
					fixed=false;			//reiterates while loop
				}
				
			}
			
		}
		for(int i=0;i<a.length;i++){		//to print the output
		System.out.println(a[i]);
		}
	}

}
