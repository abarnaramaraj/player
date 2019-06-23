import java.util.*;
import java.lang.*;
import java.io.*;
public claas Primeinterval1
{
	public static void main (String[] args) 
	{
		int f,u ,g1=1,h=0;
        Scanner sc=new Scanner (System.in);
        f=sc.nextInt();
        u=sc.nextInt();
		for(int j=f;j<=u;j++)
		{
			g1=0;
			for(int k=1;k<=j;k++)
			{
				if(j%k==0)
					g1++;
			}
			if(g1==2)
				h++;
		}
		System.out.println(h);
	}

	}
