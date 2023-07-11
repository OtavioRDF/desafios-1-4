import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class D1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int linhas = sc.nextInt();

    int nums;
    ArrayList<Integer> pares = new ArrayList<Integer>();
    ArrayList<Integer> impares = new ArrayList<Integer>();
    ArrayList<Integer> total = new ArrayList<Integer>();
    
    for (int i = 0; i < linhas; i++){
      nums = sc.nextInt();
      (nums % 2 == 0 ? pares : impares).add(nums);
    }
    
    pares.sort(Comparator.naturalOrder());
    impares.sort(Comparator.reverseOrder());

    total.addAll(pares);
    total.addAll(impares);

    for (int numero: total){
      System.out.println(numero);
    }

    sc.close();
  }
}