import java.util.Scanner;

public class Exercicios_8 {
   //(Lista1_08) Construa um programa em Java que leia (via teclado) as horas, minutos e segundos em determinado momento do dia, e que calcule e mostre qual o total de segundos decorridos neste dia. (DICA: totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos).

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int hora, minuto, segundo, totalSegundos;

    System.out.println("defina hora: ");
    hora = ler.nextInt();
    System.out.println("defina minuto: ");
    minuto = ler.nextInt();
    System.out.println("defina segundo: ");
    segundo = ler.nextInt();

    totalSegundos = ((hora * 60 * 60) + (minuto * 60) + segundo);

    System.out.printf("Este é o total de segundos: %d ", (totalSegundos));
}
}
