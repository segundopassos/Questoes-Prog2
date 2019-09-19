import java.util.Scanner;
public class Q5
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String[]args)
	{
		q5();
	}
	static void q5()
	{
		
		System.out.println("Digite valor em dolar U$ : ");
		float d=sc.nextFloat();
		System.out.println("Digite a cotação do dolar  : ");
		float c=sc.nextFloat();
		System.out.println("R$ : "+(c*d));
		
		
	}

}
