import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		for(int j=0;j<10;j++)
		a[j]=s.nextInt();
		int min=a[0];
		for(int i=1;i<10;i++)
		if(min>a[i])
		min=a[i];
		System.out.print(min);
 
 
	}
}
