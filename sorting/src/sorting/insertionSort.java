package sorting;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,4,6,1,3};
		int temp;
		
		for(int j=0;j<a.length-1;j++){
			for(int i=0;i<a.length-1;i++){
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		System.out.println("Elements after sorting:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
