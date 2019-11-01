import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
    private int[][] mina;
    private char[][] tabuleiro;
    private int linha, coluna;
    
    
    Scanner entrada = new Scanner(System.in);
    Random random = new Random();
   
    
    public Tabuleiro(){
        mina = new int[10][10];
        tabuleiro = new char[10][10];
        iniciarMinas(); // coloca 0 em todas as posições do tabuleiro de minas
        embaralhaMinas(); //coloca, aleatoriamente, 10 minas no tabuleiro de minas
        preencheDicas();//preenche o tabuleiro de minas com o número de minas vizinhas
        iniciaTabuleiro();//inicia o tabuleiro de exibição com _
        
      
        
    }
    
    public boolean ganhou(){
        int count=0;
        for(int line = 1 ; line < 9 ; line++)
            for(int column = 1 ; column < 9 ; column++)
                if(tabuleiro[line][column]=='_')
                    count++;
        if(count == 10)
            return true;
        else
            return false;                
    }
    
    public void abrirVizinhas(){
        for(int i=-1 ; i<2 ; i++)
            for(int j=-1 ; j<2 ; j++)
                if( (mina[linha+i][coluna+j] != -1) && (linha != 0 && linha != 9 && coluna != 0 && coluna != 9) ){
                    tabuleiro[linha+i][coluna+j]=Character.forDigit(mina[linha+i][coluna+j], 10);
                }
    }
    
    public int getPosicao(int linha, int coluna){
        return mina[linha][coluna];
    }
    
    public boolean setPosicao(){
            
            do{
                System.out.print("\nLinha: "); 
                linha = entrada.nextInt();
                System.out.print("Coluna: "); 
                coluna = entrada.nextInt();
                
                if( (tabuleiro[linha][coluna] != '_') && ((linha < 9 && linha > 0) && (coluna < 9 && coluna > 0)))
                    System.out.println("Esse campo já está sendo exibido");
                
                if( linha < 1 || linha > 8 || coluna < 1 || coluna > 8)
                    System.out.println("Escolha números de 1 até 8");
                
            }while((linha < 1 && linha > 8) && (coluna < 1 && coluna > 8) || (tabuleiro[linha][coluna] != '_') );
            
            if(getPosicao(linha, coluna)== -1)
                return true;
            else
                return false;
            
    }
