import java.util.Scanner;
public class Q43 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite a sua idade (HOMEM)");
		int hom1=sc.nextInt();
		System.out.println("Digite a sua idade (HOMEM 2)");
		int hom2=sc.nextInt();
		
		System.out.println("Digite a sua idade (MULHER)");
		int mul1=sc.nextInt();
		System.out.println("Digite a sua idade (MULHER 2)");
		int mul2=sc.nextInt();
		
		if(hom1>hom2 & mul1>mul2) {
			System.out.println("Soma do H com M :"+(hom1+mul2));
			
		}
		else {
			System.out.println("Produto do H com M :"+(hom2*mul1));
		}
	}

}
