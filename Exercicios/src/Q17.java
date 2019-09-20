	import java.util.Scanner;
	public class Q17 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main (String[]args) 
	{
		float pob,pon,pov;
		System.out.println("Digite o total de eleitores");
		int eleit=sc.nextInt();
		System.out.println("Digite o numero de votos brancos");
		int branco=sc.nextInt();
		System.out.println("Digite o numero de votos nulos");
		int nulo=sc.nextInt();
		System.out.println("Digite o numero de votos validos");
		int validos=sc.nextInt();
		pob=(100*branco)/eleit;
		pon=(100*nulo)/eleit;
		pov=(100*validos)/eleit;
		System.out.println("RESULTADOS : ");
		System.out.println("");
		System.out.println("Porcentagem votos brancos: "+pob);
		System.out.println("Porcentagem votos nulos: "+pon);
		System.out.println("Porcentagem votos validos: "+pov);
		
		
		
		
	}

}