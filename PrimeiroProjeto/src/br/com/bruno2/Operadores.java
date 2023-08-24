package br.com.bruno2;

public class Operadores {

    public static void main (String args[]){
        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        boolean isIgual = num1 == num2;
        boolean isDif = num1 != num2;
        boolean isMaiorIgual = num1 >= num2;

    }

    private static void operacoesIncrementoDecremento() {
        int num1 = 10;
        num1++;
        num1--;
    }

    private static void operacoesAtribuicoes() {
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        numero3 += numero3;

    }


    public static void operacoesAritmeticas(){
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num2 / num1;
        int num6 = num1 * num2;


        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

    }



}
