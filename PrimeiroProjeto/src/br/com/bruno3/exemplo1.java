package br.com.bruno3;

public class exemplo1 {

    public static void main (String args[]){

        //boxing
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;
        Long cpf = 1234l;

        //unboxing
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');

        int idade2 = Integer.valueOf(12);
    }
}
