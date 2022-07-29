package pkg1;

import java.util.Arrays;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] c = {10,20,30,40,50};
		
		//a[0]=10;
		
		//a[1]=20;
		
		//a[2]=30;
		
		//a[3]=40;
		
		//a[4]=50;
		
		int d=c.length;	
		System.out.println(Arrays.toString(c));
		//Replace last and First Element
		int p=c[0]; //temporary variable
		c[0]=c[d-1];
		System.out.println(Arrays.toString(c));
		
		c[d-1]=p;
	System.out.println(Arrays.toString(c));

	}

}
