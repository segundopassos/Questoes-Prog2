import java.util.Scanner;
public class Q3 
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String[]args)
	  {
	    q3();
	  }

	  static void q3()
	  {
		  System.out.println("Digite o seu nome");
		  String nome=sc.nextLine();
		  System.out.println("Digite o seu salario fixo");
		  float sal=sc.nextFloat();
		  System.out.println("Digite o quanto efetuou em vendas (em REAIS)");
		  float vendas=sc.nextFloat();
		  System.out.println("Nome : "+(nome));
		  System.out.println("Salario fixo :"+(sal));
		  System.out.println("Salario final :"+((vendas*0.15)+sal));
	  }

}
