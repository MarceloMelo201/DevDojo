package javacore.AintroducaoClasses.teste;

import javacore.AintroducaoClasses.dominio.Carro;

public class ExercicioCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();


        carro.nome = "Polo";
        carro.ano = 2021;
        carro.modelo = "Hatch";

        carro2.nome = "Civic";
        carro2.ano = 2022;
        carro2.modelo = "Sedan";

        System.out.println("Nome: "+ carro.nome);
        System.out.println("Modelo: "+ carro.modelo);
        System.out.println("Ano: "+ carro.ano);

        System.out.println("\nNome: "+ carro2.nome);
        System.out.println("Modelo: "+ carro2.modelo);
        System.out.println("Ano: "+ carro2.ano);





    }
}
