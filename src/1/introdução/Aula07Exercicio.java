package academy.devdojo.maratonajava.introdução;

public class Aula07Exercicio {
    //Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
    // Considerando 1 como domingo

    public static void main(String[] args) {

       byte dia = 2;

       switch (dia){

           case 1:
               System.out.println("Final de semana");
               break;
           case 2:
               System.out.println("Dia útil");
               break;
           case 3:
               System.out.println("Dia útil");
               break;
           case 4:
               System.out.println("Dia útil");
               break;
           case 5:
               System.out.println("Dia útil");
               break;
           case 6:
               System.out.println("Dia útil");
               break;
           case 7:
               System.out.println("Final de semana");
               break;
           default:
               System.out.println("Opção inválida");
               break;

       }








    }
}
