package br.com.bruno5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("********* exemploListaSimples **********");
        List<String> lista = new ArrayList<String>();
        lista.add("Bruno Vinicius");
        lista.add("João Vitor");
        lista.add("Lucas Silva");
        System.out.println(lista);
        System.out.println("");

    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("*********** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new ArrayList<>();
        lista.add("Bruno Vinicius");
        lista.add("Caio Silva");
        lista.add("Antonio Vitor");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

    }
}
