import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, bem-vinda ao sistema!");
        System.out.println("Digite o nome do aluno");
        String aluno = entrada.nextLine();

        System.out.println("Digite a nota de Filosofia do aluno " +aluno);
        double notaFilosofia = entrada.nextDouble();

        System.out.println("Digite a nota de Biologia do aluno " +aluno);
        double notaBiologia = entrada.nextDouble();

        //Calculo da Media Geral e do aluno
        double mediaGeral = 7;
        double mediaAluno = (notaFilosofia + notaBiologia)/2;

        if(mediaAluno >= mediaGeral){

            System.out.println("O aluno " + aluno + ", tem uma média de " + mediaAluno + " APROVADO.");

        } else if(mediaAluno >= 5 ){
            System.out.println("Ficou de recuperação, com média " + mediaAluno);
        }else{
            System.out.println("A aluna " + aluno + ", tem uma média de " + mediaAluno + " REPROVADO.");
        }


    }
}