package academy.devdojo.maratonajava.introdução;

public class Aula04EstruturasCondicionais  {
    public static void main(String[] args) {

     //Estruturas Condicionais: if, else, else if...

     int idade = 20;

     if(idade > 20){

         System.out.println("pode");

     } else if (idade < 20) {

         System.out.println("Não pode");
     } else {

         System.out.println("Não pode");
     }

    //OperadorTernário:

        double salario = 6000;

        String mensagemDoar = "Eu vou doar 500 pro devdojo";
        String mensagemNaoDoar = "Eu não vou doar 500 pro devdojo";

       //(condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);





    }
}
