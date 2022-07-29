package pkg1;

import java.util.Arrays;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a= {"my","Name","Is","Sumit"};
		System.out.print("original Array is :");
		System.out.println(Arrays.toString(a));
		
		String e=a[0];
		String f=a[1];
		String g=a[2];
		String h=a[3];
		
		a[a.length-1]=e;
		a[a.length-2]=f;
		a[a.length-3]=g;
		a[a.length-4]=h;
		
		System.out.print("Revers  Array is :");
		System.out.println(Arrays.toString(a));
		
		
	}
}

	
		

