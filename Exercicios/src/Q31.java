import java.util.Scanner;
public class Q31 {
	static Scanner sc=new Scanner (System.in);
	public static void main (String[]args) {
		
		System.out.println("Digite o seu salario");
		float sal=sc.nextFloat();
		System.out.println("Digite o valor de vendas em reais");
		float vend=sc.nextFloat();
		if(vend<=1500){
			System.out.println("Seu salario final é : "+(sal*0.03)+sal);
			
		}
		
		else {
			System.out.println("Seu salario final é : "+((sal*0.03)+sal)+(sal*0.05));
		}
	
	}
}
