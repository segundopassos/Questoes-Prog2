import java.util.Scanner;
public class Q39 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite o nome do time ");
		String nome1=sc.nextLine();
		System.out.println("Quantos gols o time marcou ? ");
		int gol=sc.nextInt();
		
		System.out.println("Digite o nome do 2º time ");
		String nome2=sc.nextLine();		
		System.out.println("Quantos gols o time marcou ? ");
		int gol2=sc.nextInt();
		
		if(gol>gol2) {
			System.out.println("Time "+nome1+" GANHOU");
	
			if(gol==gol2) {
				System.out.println("EMPATE");
			
			}
			else {
				System.out.println("Time "+nome2+" GANHOU");
			}
			
		
		}
		
		
		
		
		
		
	}

}
