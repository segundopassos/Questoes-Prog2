import java.util.Scanner;
public class Q6
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String[]args)
	{
		q6();
	}
	static void q6()
	{
		
		System.out.println("Digite valor depositado :");
		float g=sc.nextFloat();
		System.out.println("O seu valor final é de  :"+((g*0.007)+g));
		
		
	}

}