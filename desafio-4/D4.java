import java.util.ArrayList;
import java.util.Scanner;

public class D4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int entrada = sc.nextInt();
    sc.nextLine();
    ArrayList<String> frases = new ArrayList<>();

    for (int i = 0; i < entrada; i++){
      String frase = sc.nextLine();
      StringBuilder inicio = new StringBuilder(frase.substring(0, frase.length()/ 2));
      StringBuilder fim = new StringBuilder(frase.substring(frase.length()/ 2, frase.length()));
      frases.add(frase = inicio.reverse().toString() + fim.reverse().toString());
    }

    for(String f: frases) System.out.println(f);
    sc.close();
  }
}