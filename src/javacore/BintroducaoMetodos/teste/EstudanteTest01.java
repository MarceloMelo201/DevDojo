package javacore.BintroducaoMetodos.teste;

import javacore.BintroducaoMetodos.dominio.Estudante;
import javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        //Criando objetos para chamar as classes

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        /*
        Esse código Java está criando e utilizando objetos da classe Estudante e da classe ImpressoraEstudante
        para imprimir informações sobre dois estudantes fictícios.

        Classe Estudante:

        Define um modelo básico de um estudante com atributos como nome, idade e sexo.
        Os objetos estudante01 e estudante02 são criados como instâncias dessa classe,
        cada um com seus próprios valores para nome, idade e sexo.

        Classe ImpressoraEstudante:

        Contém um método imprime que recebe um objeto do tipo Estudante como argumento e imprime seus atributos.

        No método main:

        São criados dois objetos Estudante, estudante01 e estudante02, com informações fictícias sobre cada um (como nome, idade e sexo).
        Um objeto ImpressoraEstudante chamado impressora é criado para poder usar seu método imprime.
        O método imprime da impressora é então chamado duas vezes: uma para cada objeto Estudante,
        para imprimir suas informações na saída padrão (provavelmente no console).
        Resumindo, o código cria objetos de estudantes com informações simuladas e usa uma impressora para exibir essas informações na tela.


         */

    }
}
