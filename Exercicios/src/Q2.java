import java.util.Scanner;
public class Q2
{
  static Scanner sc=new Scanner(System.in);
  public static void main (String[]args)
  {
    q2();
  }

  static void q2()
  {
    System.out.println("digite a distancia em KM: ");
    double km = sc.nextDouble();
    System.out.println("digite a quantidade em L: ");
    double litros = sc.nextDouble();

    System.out.println(" o resultado é:"+ ( km / litros ));
         
  }
}
