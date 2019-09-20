import java.util.*;
public class Q32 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		float saldoAt;
		
		System.out.println("Digite o Nº da sua conta ");
		int conta=sc.nextInt();
		
		System.out.println("Digite o seu saldo ");
		float saldo=sc.nextFloat();
		
		System.out.println("Digite o seu debito ");
		float deb=sc.nextFloat();
		
		System.out.println("Digite o seu credito ");
		float cred=sc.nextFloat();
		
		saldoAt=(saldo-deb)+cred;
		System.out.println("Saldo atual é : "+saldoAt);
		
		if(saldo>=0) {
			System.out.println("Saldo POSITIVO  ");
			
			
		}
		
		else {
			System.out.println("Saldo NEGATIVO ");
		}
		
		
		
		
	}

}
