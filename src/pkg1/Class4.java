package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] a = new int [3];
		
		Scanner b = new Scanner(System.in);
		System.out.print("Enter first Number :");
		a[0]=b.nextInt();
		System.out.print("Enter Second Number :");
		a[1]=b.nextInt();
		System.out.print("Enter Third Number :");
		a[2]=b.nextInt();
		
		System.out.println(Arrays.toString(a));
		
		b.close();
	}

}
