import java.util.Scanner;
public class Q25 {
	static Scanner sc=new Scanner(System.in);   
	public static void main(String[] args) {
		
		System.out.println("Digite o ano atual");
		int anoA=sc.nextInt();
		System.out.println("Digite o ano do seu nascimento");
		int anoN=sc.nextInt();
		int idade;
		idade=anoA-anoN;
		if(idade>=16) {
			System.out.println("Voce já pode votar");
		}
		else {
			System.out.println("Ainda não");
		}

	}

}
