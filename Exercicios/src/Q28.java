import java.util.Scanner;
public class Q28{

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Digite a hora de inicio: ");

       int hr1 = sc.nextInt();

       System.out.println("Digite a hora final: ");

       int hr2 = sc.nextInt();

       int temp = hr2 - hr1;

       if(temp < 0){

       int dia = temp + 24;

       System.out.println("O jogo teve "+dia+" horas de duração");

       }else{

       System.out.println("O jogo teve "+temp+" horas de duração");

       }

    }

}
