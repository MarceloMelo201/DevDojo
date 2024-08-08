package academy.devdojo.maratonajava.introdução;

public class Aula09Exercicio {
    public static void main(String[] args) {

        // IMPRIMA TODOS OS NÚMEROS PARES DE 0 ATÉ 1000000

        for (int i = 0; i <= 1000000; i++){

            if (i % 2 == 0){

                System.out.println("Número par: "+ i);
            }
        }
    }
}
