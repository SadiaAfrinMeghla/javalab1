import java.util.Scanner;
public class s1{
	  public static void main (String args[])
	  {
		  Scanner a=new Scanner(System.in);
		  String S = a.nextLine();
		  int n = S.length();
		  for (int i=(n-1);i>=0;i--)
		  {
		  System.out.print(S.charAt(i));
		  }
		  
	  }
}