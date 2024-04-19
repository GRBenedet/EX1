import java.util.Scanner;

public class Exercicios_7 {
    //(Lista1_07) Construa um programa em Java que leia (via teclado) um comprimento em polegadas, calcule e mostre o comprimento correspondente em milímetros, considerando que 1 polegada equivale a 25,4 milímetros. (DICA: Usar dados do tipo float para ter precisão nos resultados (%.1f)).
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float  polegada, milímetros;

        System.out.println("defina as polegadas: ");
        polegada = ler.nextFloat();

        milímetros = (float) (polegada * 25.4);

        System.out.printf("estas polegadas se equivale a: %.1f ", (milímetros));
    }
}
