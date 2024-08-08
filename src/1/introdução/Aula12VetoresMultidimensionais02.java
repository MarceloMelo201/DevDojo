package academy.devdojo.maratonajava.introdução;

public class Aula12VetoresMultidimensionais02 {
    public static void main(String[] args) {

        //Inicialização

        int [][] arrayInt = new int [3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[4];
        arrayInt[2] = new int[6];

        int [][] arrayInt2 = {{1,2}, {3, 4, 5, 6}, {7, 8, 9, 10, 11, 12, 13}}; // Outra forma de inicialização

        for(int[] arrayBase: arrayInt2){
            System.out.println("\n-----");
            for(int num: arrayBase){

                System.out.print(num+ " ");
            }
        }
    }
}
