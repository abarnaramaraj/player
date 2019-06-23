import java.util.*;
import java.lang.*;
import java.io.*;
public claas Primeinterval
{
	public static void main (String[] args) 
	{
		int f,u ,g=1,h=0;
        Scanner sc=new Scanner (System.in);
        f=sc.nextInt();
        u=sc.nextInt();
		for(int j=f;j<=u;j++)
		{
			g=0;
			for(int k=1;k<=j;k++)
			{
				if(j%k==0)
					g++;
			}
			if(g==2)
				h++;
		}
		System.out.println(h);
	}

	}
