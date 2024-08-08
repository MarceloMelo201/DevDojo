package academy.devdojo.maratonajava.introdução;

public class Aula12VetoresMultidimensionais {
    public static void main(String[] args) {
        // Vetores Multidimensionais (Matrizes)

        int[][] dias = new int [2][2];

        dias[0][0] = 1;
        dias[0][1] = 2;

        dias[1][0] = 3;
        dias[1][1] = 4;


        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[0].length; j++) {

                System.out.println(dias[i][j]);

            }

        }

        for (int[] arrBase:dias) { // Pega cada uma das posições e cria uma variável de referência
            for(int num: arrBase){ //
                System.out.println(num);
            }
        }


    }
}
