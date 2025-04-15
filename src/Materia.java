public class Materia {
    String nomeMateria;
    double notaAvaliacao;

    String verificaAprovacao(){
        if(this.notaAvaliacao >= 7){
            return "Aprovado";

        } else if(this.notaAvaliacao >= 5 ){
            return "Recuperação";
        }else{
            return "Reprovado";
        }
    }
}
