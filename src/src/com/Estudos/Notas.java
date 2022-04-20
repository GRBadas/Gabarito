package src.com.Estudos;

public class Notas extends Gabarito{

    public static void numAlunos(){
        System.out.println("Digite a quantidade de alunos que fizeram a prova : ");
        nAlunos = input.nextInt();
       }

  public static void getNotaAluno(){
    int notaAluno;
    for(int i = 0; i < nAlunos; i++){
        notaAluno = 0;
       for(int x = 0; x < gabarito.length; x++){
           System.out.println("Digite a resposta " + (x + 1) + "  do aluno " + (i + 1) + ":");
           int resposta = input.nextInt();
           if(resposta == gabarito[i]){
               notaAluno++;
           }      
           notas[i] = notaAluno;
  }
 }
}

  public static void printData(){
    for(int i = 0; i < nAlunos; i++){
        System.out.println("Aluno " + (i + 1) + ":");
        System.out.println("Nota : " + notas[i]);
  }
 }

 public static void printMaiorNota(){
     int maiorNota = -1;
     int alunoMaiorNota = 0;
     for(int i = 0; i < notas.length; i++){
       if(notas[i] > maiorNota){
           maiorNota = notas[i];
           alunoMaiorNota = (i + 1);
       }
     }
     System.out.println("Maior nota : " + maiorNota);
     System.out.println("Aluno com a maior nota : " + alunoMaiorNota);
 }
}
