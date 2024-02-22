package cpm.arrays;

import java.util.Arrays;

public class ArrayDemo {
	static int serachEle(int[] a,int ele)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
				return i;
		}
		return -1;
	}
	
public static void main(String[] args) {
//	//int[] a = {1,2,3,4,5};
//	int[] a = new int[5];
//	a[0]=10;
//	a[1]=20;
//	a[2]=30;
//	a[3]=40;
//	a[4]=50;
//	
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.print(a[i]+"  ");
//	}
//	//System.out.println(serachEle(a,20));
	
//	int b[][] =new int[3][3];//array of references
//			//{{1,2,3},{4,5,6},{7,8,9}}; 
//			//jagged arrays
//	b[0] = new int[3]; //Sd arrays
//	b[1] = new int[3];
//	b[2] = new int[3];
//	
//	b[0][0] = 10;
//	b[0][1]=20;
//	b[0][2]=30;
//	
//	
//	b[1][0] = 100;
//	b[1][1]=200;
//	b[1][2]=300;
//	
//	b[2][0] = 101;
//	b[2][1]=201;
//	b[2][2]=301;
//	for(int i=0;i<3;i++)
//	{
//		for(int j=0;j<b[i].length;j++)
//		{
//			System.out.print(b[i][j]+"  ");
//
//		}
//		System.out.println();
//	}
	
	
	int a[] = {6,3,4,5,2,3,1,2,3,2,4,5,6,8,5,7};
	
	System.out.println(Arrays.toString(a));
	
	
	int [][] b={{1,2,3},{4,5,6},{7,8,9}};
	
	System.out.println(Arrays.deepToString(b));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
//	int d[]=Arrays.copyOf(a, a.length); //deep copy
//	System.out.println(Arrays.toString(d));
	
	int d[]=Arrays.copyOfRange(a, 4,9); //deep copy
	System.out.println(Arrays.toString(d));
	Arrays.fill(a, 111);
	System.out.println(Arrays.toString(a));
	
	System.out.println(Arrays.binarySearch(a, 112));
}	
}
