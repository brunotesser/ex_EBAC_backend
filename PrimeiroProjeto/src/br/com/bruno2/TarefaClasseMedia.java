package br.com.bruno2;

public class TarefaClasseMedia {

    public static void main (String args[]){
        notaFinal();
    }

    private static void notaFinal() {
        int nota1 = 10;
        int nota2 = 5;
        int nota3 = 8;
        int nota4 = 10;

        int resultadoNota = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(resultadoNota);

    }
}
