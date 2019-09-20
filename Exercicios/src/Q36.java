import java.util.*;
public class Q36 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite um valor");
		float num=sc.nextFloat();
		
		System.out.println("Digite um valor");
		float num2=sc.nextFloat();
		
		System.out.println("Digite um valor");
		float num3=sc.nextFloat();
		
		if(num>num2 && num2>num3){
			System.out.println("O maior é :"+(num+num2));
		}
		else if(num2>num && num>num3) {
			System.out.println("O maior é :"+(num2+num));
		}
		else if(num3>num2 && num2>num) {
			System.out.println("O maior é :"+(num3+num2));
		}
		else if(num3>num2 && num2>num) {
			System.out.println("O maior é :"+(num3+num2));
		}
		
	}

}
