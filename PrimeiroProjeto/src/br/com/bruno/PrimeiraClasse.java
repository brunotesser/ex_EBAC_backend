package br.com.bruno;

public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Olá Bruno");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());

    }
}


