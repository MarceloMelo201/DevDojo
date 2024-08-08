package academy.devdojo.maratonajava.introdução;

public class Aula03Operadores {
    public static void main(String[] args) {

    //Operadores Aritméticos: + - / *
        int numero01 = 10;
        int numero02 = 20;

        System.out.println(numero01 + numero02); // Soma
        System.out.println("Valor "+numero01 + numero02); // Concatenação

     // Resto: %

        int resto = 20 % 2;
        System.out.println(resto);


    //Operadores Relacionais: < > <= >= == !=

    //Operadores lógicos:

    // && (and); || (or); ! (not); É IGUAL AO C!!!

    //Operadores de atribuição:

    //+= -= *= /= %=

    double bonus = 1000; // 1000
    bonus = bonus + 1800; // 2800

    bonus += 1800; // 4600

    // ++ --
    int contador = 0;
    contador += 1; // contador = contador + 1
    contador++;
    contador--;

    }
}
