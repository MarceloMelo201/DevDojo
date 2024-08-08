package javacore.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {

    //Parãmetros tipo referência

    //Método para imprimir objetos de outra classe
    public void imprime(javacore.BintroducaoMetodos.dominio.Estudante estudante){

        //Imprimindo objetos de outra classe

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }

}
