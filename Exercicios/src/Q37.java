import java.util.*;
public class Q37 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite um valor");
		float num=sc.nextFloat();
		
		System.out.println("Digite um valor");
		float num2=sc.nextFloat();
		
		System.out.println("Digite um valor");
		float num3=sc.nextFloat();
		
			if((num2>num && num2<=num3)){
			System.out.println("Ordem:"+num+"   " +num2+ "   "+num3);
		
			if(num2<num && num<num3) {
			System.out.println("Ordem:"+num2+"   " +num+ "  "+num3);
		}
		 	if(num2<num3 && num3<=num) {
			System.out.println("Ordem :"+num2+"   " +num3+ "  "+num);
		}
		}
		
		 
		
	}

}