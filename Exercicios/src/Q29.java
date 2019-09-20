import java.util.Scanner;
public class Q29 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Digite numero de hr trabalhadas por mes");
		int hr=sc.nextInt();
		System.out.println("Digite salario por hr");
		float salH=sc.nextFloat();
		if(hr>160) {
			salH=(hr-160)*(salH)+(salH*(50/100));
			float salTotal;
			salTotal=(160*salH)+hr;
			System.out.println("O número de horas trabalhadas no mês é :"+hr);
			System.out.println("O salario por hora é de :"+salH);
			System.out.println("Salario total é :"+salTotal);}
			else {
				float salNorm;
				salNorm=hr*160;
				System.out.println("O numero de hrs trabalhadas é :"+hr);
				System.out.println("O salario por hr é :"+salH);
				System.out.println("O salario normal é : "+salNorm);}
			
		}
	}
