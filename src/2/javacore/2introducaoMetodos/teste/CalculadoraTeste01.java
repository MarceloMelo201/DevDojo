package javacore.BintroducaoMetodos.teste;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {

        //Funções ou Métodos

        int a = 10;
        int b = 25;

        Calculadora calculadora = new Calculadora();

        calculadora.soma();

        calculadora.multi(a, b);

        double num3 = calculadora.divide(10, 20);

        System.out.println(num3);

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);


    }
}
