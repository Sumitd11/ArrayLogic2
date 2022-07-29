package pkg1;

import java.util.Arrays;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = {10,20,30,40,50};
		
		//a[0]=10;
		
		//a[1]=20;
		
		//a[2]=30;
		
		//a[3]=40;
		
		//a[4]=50;
		
		int y=x.length;	
		System.out.println(Arrays.toString(x));
		//Replace last and First Element
		int z=x[0]; //temporary variable
		x[0]=x[y-1];
		System.out.println(Arrays.toString(x));
		
		x[d-1]=z;
	System.out.println(Arrays.toString(x));

	}

}
