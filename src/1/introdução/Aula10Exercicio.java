package academy.devdojo.maratonajava.introdução;

public class Aula10Exercicio {
    public static void main(String[] args) {

        // Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        // Condição é que valor da parcela tem que ser maior ou igual a 1000

       double valorTotal = 30000;
       double parcela = 1000;

       while (true){

           double i = valorTotal / parcela;

           System.out.println("Parcela possível: "+ i);

           parcela = parcela + 1000;

           if (parcela > valorTotal){

               break;
           }

       }
    }
}
