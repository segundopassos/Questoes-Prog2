import java.util.Scanner;
public class Q24 {
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) {
		
		System.out.println("Digite sua primeira nota");
		float n1=sc.nextFloat();
		System.out.println("Digite sua segunda nota");
		float n2=sc.nextFloat();
		float media;
		media=(n1+n2)/2;
		if(media>=6) {
			System.out.println("Aluno APROVADO com media "+media);
			
		}
		else {
			System.out.println("Aluno REPROVADO com media "+media);
		}
		
		
		
		

	}

}
