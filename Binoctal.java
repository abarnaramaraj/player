import java.util.*;
import java.lang.*;
import java.io.*;
public class Binoctal
{
	public static void main (String[] args) 
	{
	String n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLine();
		long l = Long.parseLong(n, 2);
       System.out.println(Long.toOctalString(l));
	}
}
