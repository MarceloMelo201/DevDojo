package javacore.AintroducaoClasses.teste;

import javacore.AintroducaoClasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Carlos";
        professor.idade = 28;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.nome);
    }
}
