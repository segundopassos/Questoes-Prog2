import java.util.Scanner;
public class Q30 {
	static Scanner input=new Scanner (System.in);
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual é o seu sexo: masculino ou feminino? \n Para masculino digite [1]. \n Para feminino digite [2]. \n");		
		int sexo = Integer.parseInt(input.nextLine()); // salva na váriavel sexo.
			
		if (sexo == 1)
		{
			System.out.println("- O seu sexo é: masculino!");
		}
		else if (sexo == 2)
		{
			System.out.println("- O seu sexo é: feminino!");
		}

		System.out.println();
		System.out.println("Qual é o seu peso [Exemplo: 60,5]?");
		
		double peso = Double.parseDouble(input.nextLine()); // salva na váriavel peso.
		System.out.printf("- O seu peso é: %6.1f kilogramas!%n", peso);

		System.out.println();
		System.out.println("Qual é a sua altura [Exemplo: 1,70]?");
		
		double altura = Double.parseDouble(input.nextLine()); // salva na váriavel altura.
		System.out.printf("- A sua altura é: %6.2f metros!%n%n", altura);

		double resultado_imc = peso / ((altura)*(altura)); // calcula o valor do IMC
		double imc[] = new double[2];
		
		
		if (sexo == 1)
		{
		   System.out.println("Resultado IMC (Masculino):");		   
		   imc[0] = 20.7; imc[1] = 26.4;
		}
		else
		{
		   System.out.println("Resultado IMC (Feminino):");
		   imc[0] = 19.1; imc[1] = 25.8;
		}
	  
		if (resultado_imc < imc[0])
		{
			System.out.printf("- O seu IMC é: %6.1f. Você está abaixo do peso!", resultado_imc);
		}
		else if ((resultado_imc >= imc[0]) && (resultado_imc < imc[1]))
		{
			System.out.printf("- O seu IMC é: %6.1f. Você está no peso ideal!", resultado_imc);
		}
		else if (resultado_imc >= imc[1])
		{
			System.out.printf("- O seu IMC é: %6.1f. Você está acima do peso!", resultado_imc);
		}
		
		System.out.println();
		System.out.println();
		System.out.printf("Abaixo do peso: Menor que %1$.1f.%nPeso ideal: Maior que %1$.1f e menor que %2$.1f.%nAcima do peso: Maior que %2$.1f", imc[0], imc[1]);
	}	

}
