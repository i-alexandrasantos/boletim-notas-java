public class Main {
    public static void main(String[] args) {

        //pega o nome do aluno
        //calcula a media de 2 materias
        //informa se foi aprovado, reprovado ou esta de recuperação

        String primeiraAluna = "Alexandra";
        String segundaAluna = "Ravena";

        //matérias
        double notaFilosofia;
        double notaBiologia;
        double mediaGeral = 7;

        System.out.println("Olá, bem vinda ao sistema.");

        //notas estaticas
        notaFilosofia = 7.5;
        notaBiologia = 7.0;

        double mediaAluna = (notaFilosofia + notaBiologia)/2;

        if(mediaAluna >= mediaGeral){

            System.out.println("A aluna " + primeiraAluna + ", tem uma média de " + mediaAluna + " e ela foi aprovada!");

        } else if(mediaAluna >= 5 ){
            System.out.println("Ficou de recuperação, com média " + mediaAluna);
        }else{
            System.out.println("A aluna " + primeiraAluna + ", tem uma média de " + mediaAluna + " e ela foi reprovada.");
        }


    }
}