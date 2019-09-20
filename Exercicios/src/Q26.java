import java.util.Scanner;
public class Q26 {
	
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Digite um valor");
		float v1=sc.nextFloat();
		System.out.println("Digite outro valor");
		float v2=sc.nextFloat();
		if(v1>v2) {
			System.out.println("O maior é :"+v1);
		}
		else {
			System.out.println("O maior é :"+v2);
		}
	}

}
