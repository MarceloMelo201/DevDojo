package academy.devdojo.maratonajava.introdução;

public class Aula08EstruturasDeRepetição01 {
    public static void main(String[] args) {

        //while

        int count = 0;

        while (count < 10){


            System.out.println(++count);

            if (count % 2 == 0){

                continue;
            }

        }

        //Do-while

        do {

            System.out.println(++count);

        } while (count < 16);

        // For

        for (int i = 0; i <= 10; i++){

            System.out.println(i);

            if (i == 5){
                break;
            }
        }







    }
}
