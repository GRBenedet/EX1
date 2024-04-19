import java.util.Scanner;

public class Exercicios_9 {
    //(Lista1_09) Construa um programa em Java para ler (via teclado) 3 valores os quais correspondem ao número de convidados para um churrasco, sendo homens, mulheres e crianças. Sabendo que, em média, um homem come 650 gramas de carne, uma mulher come 420 gramas de carne, e uma criança come 290 gramas de carne, calcule a quantidade de carne necessária para o churrasco em quilogramas e mostre o resultado.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int homem, mulher, crianca, totalCarne;

        System.out.println("defina a quantidade de homens:");
        homem = ler.nextInt();
        System.out.println("defina a quantidade de mulheres:");
        mulher = ler.nextInt();
        System.out.println("defina a quantidade de crianças:");
        crianca = ler.nextInt();
        
        totalCarne = ((homem * 650) + (mulher * 420) + (crianca * 290));

        System.out.printf("este é o total de carne nescesaria: %d", (totalCarne));

    }
}
