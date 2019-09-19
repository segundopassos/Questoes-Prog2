import java.util.Scanner;
public class Q1
{
  static Scanner sc=new Scanner(System.in);
  public static void main (String[]args)
  {
    q1();
  }

  static void q1()
  {
    System.out.println("digite um numero: ");
    double um = sc.nextDouble();
    System.out.println("digite outro numero: ");
    double dois = sc.nextDouble();

    System.out.println(" SOMA:"+ (um + dois));
    System.out.println(" SUBTRÇÃO:"+ (um - dois));
    System.out.println(" MULTIPLICAÇÃO:"+ (um * dois));
    System.out.println(" DIVISÃO:"+ (um / dois));
         
  }
}
