import java.util.Scanner;
	public class Q18 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main (String[]args) 
	{
		System.out.println("Digite o salario em reais");
		float sal=sc.nextFloat();
		System.out.println("Digite o percentual do reajuste");
		float rea=sc.nextFloat();
		System.out.println("Seu salario atual é de : "+((rea/100)*sal)+sal);
		
	}
	
}