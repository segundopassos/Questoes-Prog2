import java.util.Scanner;
public class Q38{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		float soma1,soma2,soma3;
		System.out.println("Digite o lado 1 ");
		float lado1=sc.nextFloat();
		
		System.out.println("Digite o lado 2 ");
		float lado2=sc.nextFloat();
		
		System.out.println("Digite o lado 3 ");
		float lado3=sc.nextFloat();
		
		soma1=lado1+lado2;
		soma2=lado2+lado3;
		soma3=lado3+lado1;
		if(soma1>lado3) {
			System.out.println("Nao foi possivel");
			
			if(soma2>lado1) {
				System.out.println("Nao foi possivel");
				
			}
			if(soma3>lado2) {
				System.out.println("Nao foi possivel");
			}
		}else {
			System.out.println("Triangulo formado");
		}
	}

}
