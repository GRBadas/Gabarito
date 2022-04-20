package src.com.Estudos;
import java.util.Scanner;

public class Gabarito {
    static Scanner input = new Scanner(System.in);

    static int []gabarito = new int[10];
    static int notas[] = new int[10];
    static int nAlunos;

    public static void createGabarito(){
    for(int i = 0; i < gabarito.length; i++){
      System.out.println("Digite a resposta da questão " + (i + 1) + ":");
      gabarito[i] = input.nextInt();
     }
    }
}
