package javacore.AintroducaoClasses.teste;

import javacore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        // Para criar objetos se usa a palavra new e o nome do objeto

        Estudante estudante = new Estudante();
        //Variável estudante que faz referência a um objeto do tipo estudante

        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


    }
}
