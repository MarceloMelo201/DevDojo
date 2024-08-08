package academy.devdojo.maratonajava.introdução;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos Primitivos - Variáveis
        // int, double, float, char, byte, short, long, boolean

            int valor = 1;
            long numeroGrande = 1000000;
            double salarioDouble = 2000.00;
            float salarioFloa = 2500;
            byte idadeByte = 10;
            short idadeShort = 10;
            boolean verdadeiro = true;
            boolean falso = false;
            char caractere = 'M';

            // float salarioFloat = 2500.0F; caso queira colocar um numero quebrado no float (F)
        //Casting -- forçar número a caber em outro tipo de variável
            float salarioFloat = (float) 2500.85D;

            // String == Tipo de referência (é uma classe)

            String nome = "Marcelo Melo";

        System.out.println("O valor é "+valor);
    }
}
