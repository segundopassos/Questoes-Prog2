import java.util.Scanner;
public class Q23 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Quantas maçãs vc quer ?");
		int qnt=sc.nextInt();
		if(qnt<11) {
			System.out.println("O preço a pagar é : R$ "+(1.30*qnt));
		}
		else {
			System.out.println("O preço a pagar é : R$ "+(1*qnt));
		}
		
	}

}
