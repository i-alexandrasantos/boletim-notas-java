import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Materia> listaMateria = new ArrayList<>();

        System.out.println("========== BOLETIM  ==========");

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
            entrada.nextLine();

            System.out.println("=====================");

            //Array
            listaMateria.add(dadosMateria);
        }

        //For-each
        for (Materia materiadaLista : listaMateria){
            System.out.println( "Matéria " +materiadaLista.nomeMateria+ " | Nota : " +materiadaLista.notaAvaliacao+
            " | Status: " +materiadaLista.verificaAprovacao());
        }


    }
}