package pkg1;

import java.util.Arrays;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = new int [7];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		//Q. print middle element of array if size is odd
		
		int rem = (a.length)%2;  //7%2--->2
				
				if (rem==0)
				{
					System.out.println("Size of an array is even :" + a.length);
				}
				else
				{
					int k =(a.length)/2;   //7/2--->3.5 but data type is int so k=3 which is odd
							System.out.println(a[k]);
				}

	}

}
