import java.math.BigDecimal;
import java.util.Scanner;

public class D2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    BigDecimal entrada = sc.nextBigDecimal(); 
    
    int notas[] = {100, 50, 20, 10, 5, 2};
    BigDecimal moedas[] = {BigDecimal.ONE, new BigDecimal("0.50"), new BigDecimal("0.25"),
    new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.01")};
    
    System.out.println("NOTAS:");
    for (int nota: notas){
      var numNotas = entrada.divideToIntegralValue(new BigDecimal(nota)).intValue();
      System.out.println(
         numNotas + "    nota(s)    de    R$    " + nota
      );
      entrada = entrada.remainder(new BigDecimal(nota));
    }

    System.out.println("MOEDAS:");
    for (BigDecimal moeda: moedas){
      var numMoedas = entrada.divideToIntegralValue(moeda).intValue();
      System.out.printf(
        numMoedas + "    moeda(s)    de    R$    %.2f%n", moeda
      );
      entrada = entrada.remainder(moeda);
    }

    sc.close();
  }
}