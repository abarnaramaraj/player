import java.util.*;
import java.lang.*;
import java.io.*;
public class Binoctal
{
	public static void main (String[] args) 
	{
	String p;
		Scanner sc=new Scanner(System.in);
		p=sc.nextLine();
		long l = Long.parseLong(p, 2);
       System.out.println(Long.toOctalString(l));
	}
}
