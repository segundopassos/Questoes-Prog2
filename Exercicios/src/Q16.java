import java.util.Scanner;
	public class Q16 {
	static Scanner sc=new Scanner(System.in);
	public static void main (String[]args)
	{
		System.out.println("Digite sua idade em anos,meses e dias respectivamente ");
		int ano=sc.nextInt();
		int meses=sc.nextInt();
		int dias=sc.nextInt();
		System.out.println("Sua idade em dias é :"+((ano*365)+(meses*30))+dias);
		
}
	
}
