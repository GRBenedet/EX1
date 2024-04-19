import java.util.Scanner;

public class Exercicios_2 {

    //2. (Lista1_02) Construa um programa em Java que leia (via teclado) três números do tipointeiro, calcule e mostre o resultado da soma deles.//
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor1, valor2, valor3, resultado;
    
            System.out.println("Primeiro valor : ");
            valor1 = leia.nextInt();
            System.out.println("Segundo valor : ");
            valor2 = leia.nextInt();
            System.out.println("Terceiro valor : ");
            valor3 = leia.nextInt();
            resultado = (valor1 + valor2 + valor3);
            System.out.println(resultado);
    }
}
