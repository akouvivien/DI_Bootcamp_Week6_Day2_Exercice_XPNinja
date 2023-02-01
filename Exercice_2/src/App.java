import java.util.Scanner;

public class App {

   public static void  solutions(int a, int b, int c) {

      System.out.println("vous avez rentrée l'equation suivante");
      System.out.println(a+"X²"+b+"X"+c);

      double discriminant = Math.pow(b, 2)-(4*a*c);

      if (discriminant > 0) {
          double x1 = ((-b)+ Math.sqrt(discriminant) )/ 2*a;
          double x2 = ((-b)- Math.sqrt(discriminant) )/ 2*a;
          System.out.println(a+"X²+"+b+"X+"+c+"= 0 a deux solutions (x"+x1+"  x"+x2);
          
  
      } else if (discriminant == 0) {
         double x = (-b)/ 2*a;
         System.out.println("x² = 0  a une solution (x = "+x+")");
          
          
      }else {
         System.out.println(a+"X²+"+b+"X+"+c+"= 0 has no real solutions");
      }

  }

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("entrez les differnts coefficent d'une equation de second dégré");
      System.out.println("entrez le coefficient de x carré");
      int a = scanner.nextInt();
      System.out.println("entrez le coefficient de x");
      int b = scanner.nextInt();
      System.out.println("entrez la constante c");
      int c = scanner.nextInt();
      solutions(a,b,c);
      
    }

    }

