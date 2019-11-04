//add tempo ao tabuleiro

public class Tempo
{	
	public static void main(String[] args)
	{	int cont=0;
		
		while (2>1)
		{	try
			{	
				Thread.sleep(1000);
				
			} 
			catch (InterruptedException e)
			{	
				System.out.println("ERRO");
			}
			
			
		
		System.out.println("Seu tempo foi de :" +cont++);
			
			
		}

	}

}