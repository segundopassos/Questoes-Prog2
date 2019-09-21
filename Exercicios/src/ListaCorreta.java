import java.util.Scanner;
public class ListaCorreta {
	
	static Scanner novo=new Scanner (System.in);
	public static void main(String[] args) {
		
				q44();
				//q45();
				//q46();
				//q47();
				//q48();
				//q49();
				//q50();
				//q51();
				//q52();
				//q53();
				//q54();
				//q55();
	
	
	}
	static void q44() {
		Scanner novo = new Scanner(System.in);
		double precoMa = 1.80;
		double precoMo = 2.50;
		double pesoMa;
		double pesoMo;
		double totalMo;
		double totalMa;
		double precoFinal;

		System.out.print("Quantos Kilos de morango: ");
		pesoMo = novo.nextDouble();

		System.out.print("Quantos Kilos de maçã: ");
		pesoMa = novo.nextDouble();

		if (pesoMo > 5) {
			totalMo = (precoMo - 0.3) * pesoMo;
		} else {
			totalMo = precoMo * pesoMo;
		}

		if (pesoMa > 5) {
			totalMa = (precoMa - 0.3) * pesoMa;
		} else {
			totalMa = precoMa * pesoMa;
		}
		if ((totalMo + totalMa) > 25 || (pesoMo + pesoMa) > 8) {
			precoFinal = (totalMo + totalMa) * 0.9;
		} else {
			precoFinal = totalMo + totalMa;
		}

		System.out.println("Preço finl da compra: R$" + precoFinal);
	}

		static void q45() {
		Scanner novo = new Scanner(System.in);
		int usu;
		int senha;
		int cont = 0;

		do {
			if (cont > 0)
				System.out.println("USUARIO INVALIDO !!!");
			System.out.print("Usuario: ");
			usu = novo.nextInt();
			cont++;
		} while (usu != 1234);
		cont = 0;
		do {
			if (cont > 0)
				System.out.println("SENHA INVALIDA !!!");
			System.out.print("Senha: ");
			senha = novo.nextInt();
			cont++;
		} while (senha != 9999);
		System.out.println("ACESSO PERMITIDO !!!");
	}

		static void q46() {
		System.out.println("VERDADEIRO\nFALSO\nFALSO");
	}
	
		static void q47() {
		Scanner novo = new Scanner(System.in);
		double descMenor5 = 0.02;
		double descMenor10 = 0.03;
		double descMaior10 = 0.05;
		String produto;
		int quantidade;
		double preco;
		double total;
		double descont = 0;

		System.out.println("Nome do produto: ");
		produto = novo.nextLine();
		System.out.println("Quantidade: ");
		quantidade = novo.nextInt();
		System.out.println("Preço Unitario: ");
		preco = novo.nextDouble();

		total = quantidade * preco;

		if (quantidade <= 5) {
			descont = total * descMenor5;
		}
		if (quantidade > 5 && quantidade <= 10) {
			descont = total * descMenor10;
		}
		if (quantidade > 10) {
			descont = total * descMaior10;
		}
		System.out.println("Produto: " + produto);
		System.out.println("Preço unitário: " + preco);
		System.out.println("Total: " + total);
		System.out.println("Desconto: " + descont);
		System.out.println("Total a pagar: " + (total - descont));

	}

		static void q48() {
		Scanner novo = new Scanner(System.in);
		int ano = 2011;

		System.out.println("Entre com seu codigo: ");
		int codigo = novo.nextInt();

		System.out.println("Entre com a data de nascimento: ");
		int data = novo.nextInt();

		System.out.println("Entre com o Ano de ingresso na empresa: ");
		int tempo = novo.nextInt();

		if (ano - data >= 16) {
			if (ano - data >= 65) {
				System.out.println("Requer Aposentadoria");
			} else {
				if (ano - tempo >= 30) {
					System.out.println("Requer Aposentadoria");
				} else {
					if ((ano - data >= 60) && (ano - tempo >= 25)) {
						System.out.println("Requer Aposentadoria");
					} else {
						System.out.println("NÃO Requer Aposentadoria");
					}
				}
			}
		} else {
			System.out.println("Você não tem idade para trabalhar");
		}
	}
		static void q49() {
			Scanner novo = new Scanner(System.in);
			double a;
			double b;
			double c;
			String mens;
			
			System.out.println("Informe os lados do triângulo:");
			a = novo.nextDouble();
			b = novo.nextDouble();
			c = novo.nextDouble();
			
			if((a < b + c)&(b < a + c)&(c < a + b)) {
				if((a==b)&(b==c)) {
					mens = "triângulo equilátero";
				}else if((a==b)||(b==c)||(a==c)){
					mens = "Triângulo isóseles";
				}else {
					mens = "Triângulo escaleno";
				}
			}else {
				mens = "Não é possível formar um triângulo";
			}
			System.out.println(mens);
			
			System.out.println("*****RESPOSTAS*****");
			System.out.println("Não é possível formar um triângulo");
			System.out.println("Triângulo escaleno");
			System.out.println("Triângulo isóseles");
			System.out.println("Triângulo equilátero");
			System.out.println("Triângulo isóseles");
		}

		static void q50() {
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite: ");
		double n1 = novo.nextInt();
		double n2;
		do {
			System.out.print("Digite: ");
			n2 = novo.nextInt();
		} while (n2 == 0);

		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}
	
		static void q51() {
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite: ");
		double n1 = novo.nextInt();
		double n2;
		do {
			System.out.print("Digite: ");
			n2 = novo.nextInt();
		} while (n2 == 0);

		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

		static void q52() {
		Scanner novo = new Scanner(System.in);
		int res;

		System.out.print("Digite x: ");
		int x = novo.nextInt();
		int y;
		do {
			System.out.print("Digite y: ");
			y = novo.nextInt();

		} while (y == 0);
		int z = (x * y) + 5;

		if (z <= 0) {
			res = 'A';
		} else if (z <= 100) {
			res = 'B';
		} else {
			res = 'C';
		}
		System.out.println(z + ", " + res);
	}
	
		static void q53() {
		Scanner novo = new Scanner(System.in);
		double desconto;
		int combustivel;
		System.out.print("Número de Litros vendidos: ");
		int litro = novo.nextInt();

		System.out.print("Combustível [1]-A [2]-G: ");
		combustivel = novo.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}

		static void q54() {
		Scanner novo = new Scanner(System.in);
		double nota1;
		double nota2;
		do{
			System.out.println("Nota 1: ");
			nota1 = novo.nextDouble();
			System.out.println("Nota 2: ");
			nota2 = novo.nextDouble();
		}while(nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10);
		
		System.out.println("Média Simples: "+(nota1+nota2)/2);	
		
	}
		static void q55() {
		Scanner novo = new Scanner(System.in);
		
		int usu;
		int senha;
		int cont = 0;

		do {
			if (cont > 0)
				System.out.println("USUARIO INVALIDO !!!");
			System.out.print("Usuario: ");
			usu = novo.nextInt();
			cont++;
		} while (usu != 1234);
		cont = 0;
		do {
			if (cont > 0)
				System.out.println("SENHA INVALIDA !!!");
			System.out.print("Senha: ");
			senha = novo.nextInt();
			cont++;
		} while (senha != 9999);
		System.out.println("ACESSO PERMITIDO !!!");
	}
	
	
	
	
	
	
	}
