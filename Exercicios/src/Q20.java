import java.util.Scanner;
	public class Q20 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main (String[]args) 
	{
		System.out.println("Digite seu salario fixo");
		float sal=sc.nextFloat();
		System.out.println("Digite o total de vendas em reais");
		float vend=sc.nextFloat();
		System.out.println("Digite o numero de carros vendidos");
		float car=sc.nextFloat();
		System.out.println("Digite a comissao em reais");
		float com=sc.nextFloat();
		System.out.println("SALARIO FINAL :"+((car*com)+(vend*0.05))+sal);
		
		
		
		
		
	}
	

}