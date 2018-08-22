import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int cnt=0;
		for(int i=1;i<10000;i++)
		{
			if((n+i)%10==0)
			{
				System.out.println(n+i);
				break;
			}
		}
 
 
	}
}
