package pkg1;

import java.util.Arrays;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {10,20,30,40,50};
		
		//a[0]=10;
		//a[1]=20;
		//a[2]=30;
		//a[3]=40;
		//a[4]=50;
		
		int b=a.length;	
		System.out.println(Arrays.toString(a));
		//Replace last and First Element
		int p=a[0]; //temporary variable
		a[0]=a[b-1];
		System.out.println(Arrays.toString(a));
		
		a[b-1]=p;
	System.out.println(Arrays.toString(a));

	}

}
