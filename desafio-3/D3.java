import java.util.Scanner;

public class D3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int tamanhoArray = sc.nextInt();
    int alvo = sc.nextInt();

    int array[] = new int[tamanhoArray];

    for (int i = 0; i < tamanhoArray; i++){
      array[i] = sc.nextInt();
    }

    int cont = 0;
    
    for(int i = 0; i < array.length; i++) {
      for(int k = i + 1; k < array.length; k++){
        if (Math.abs(array[i] - array[k]) == alvo) cont++;
      }
    }

    System.out.println(cont);

    sc.close();
  }
}