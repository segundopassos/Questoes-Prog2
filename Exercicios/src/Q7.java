import java.util.Scanner;
public class Q7 
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String[] args)
	{
		q7();
	}
	static void q7()
	{
		System.out.println("Digite o preço do produto");
		float p=sc.nextFloat();
		System.out.println("Sua prestação ficará 5X de " +(p/5));
	}
}
