import java.util.Scanner; 
public class Q8 
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String[] args)
	{
		q8();
	}

	static void q8() 
	{
		System.out.println("Informe o preço do produto");
		float p=sc.nextFloat();
		System.out.println("Informe o percentual do produto");
		float per=sc.nextFloat();
		System.out.println("O preço do produto é :"+(((per/100)*p)+p));
		
	}
	
}
