package javacore.BintroducaoMetodos.dominio;

public class Calculadora {

    //Modificador de acesso(public); retorno(void); nome do método (soma);


    public void soma (){
        System.out.println(10 + 10);
    }


    //Parâmetros


    public void multi(int a, int b){

        System.out.println(a * b);

    }


    //Retorno
    //Troca o void (retorno vazio) pelo tipo da variável a ser retornado

    public double divide(double num1, double num2){
       double num3 = num1 / num2;
       return num3;

    }


    //Parâmetros (Tipos primitivos)

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);

        //Dentro da passagem de variável a variável primitiva nunca é alterada
        //Ou seja, as duas variáveis usadas de parãmetro são copiadas pelo método, na main o valor permanece igual
    }
}
