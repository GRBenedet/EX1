
//1. (Lista1_01) Construa programa em Java que leia (via teclado) dois números do tipo inteiro,calcule o produto entre eles e mostre o resultado.//

import java.util.Scanner;

public class Exercicios_1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor1, valor2, resultado;
    
            System.out.println("valor : ");
            valor1 = leia.nextInt();
            System.out.println("valor : ");
            valor2 = leia.nextInt();
            resultado = (valor1 + valor2);
            System.out.println(resultado);

    }
}