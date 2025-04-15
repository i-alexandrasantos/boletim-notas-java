import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Materia> listaMateria = new ArrayList<>();

        System.out.println("========== BOLETIM BIMESTRAL ==========");

        //Pergunta o nome
        System.out.println("Digite o nome do aluno");
        String aluno = entrada.nextLine();

        //Pergunta a quantidade de matérias do aluno
        System.out.println("Digite quantas matérias o aluno " +aluno+ " teve no último bimestre");
        int qtdMateriasBimestre = entrada.nextInt();
        entrada.nextLine();


        for (int qtdMateria = 0 ; qtdMateria < qtdMateriasBimestre; qtdMateria++ ){
            //Chamo o construtor
            Materia dadosMateria = new Materia();

            System.out.println("Digite o NOME da Matéria: ");
            dadosMateria.nomeMateria = entrada.nextLine();


            System.out.println("=====================");

            System.out.println("Digite a NOTA da Matéria: " +dadosMateria.nomeMateria);
            dadosMateria.notaAvaliacao = entrada.nextDouble();

            //Array
            listaMateria.add(dadosMateria);
        }




/*        System.out.println("Digite a nota de Filosofia do aluno " +aluno);
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
            System.out.println("O aluno " + aluno + ", tem uma média de " + mediaAluno + " REPROVADO.");
        }*/


    }
}