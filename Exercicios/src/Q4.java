import java.util.Scanner;
public class Q4 
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String[]args)
	{
		q4();
	}
	static void q4()
	{
		
		System.out.println("Digite a temperatura em graus Celcius");
		float c=sc.nextFloat();
		System.out.println("Fahrenheit : "+((9*c)+160)/5);
	}

}
