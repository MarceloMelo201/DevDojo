package academy.devdojo.maratonajava.introdução;

public class Aula05Exercicio {
    public static void main(String[] args) {

    double salarioAnual = 70000;
    double primeiraFaixa = 9.78 / 100;
    double segundaFaixa = 37.35 / 100;
    double terceiraFaixa = 49.50 / 100;
    double valorImposto = 0;

    if(salarioAnual <= 34712){

        valorImposto = salarioAnual * primeiraFaixa;

    } else if (salarioAnual >= 34713 && salarioAnual <= 68587){

        valorImposto = salarioAnual * segundaFaixa;

    } else if (salarioAnual >= 68588){

        valorImposto = salarioAnual * terceiraFaixa;
    }


        System.out.println(valorImposto);







    }
}
