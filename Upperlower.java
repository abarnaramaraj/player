import java.util.*;
import java.lang.*;
import java.io.*;
public class Upperlower
 {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String si=s.toUpperCase();
    String vi=s.toLowerCase();

    for(int i=0;i<s.length();i++)
{
      if(s.charAt(i)>='a'&&s.charAt(i)<='z')
{
        System.out.print(si.charAt(i));
      }
      else
{
        System.out.print(vi.charAt(i));
      }
    }
  }
  
}
