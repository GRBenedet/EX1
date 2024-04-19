import java.util.Scanner;

public class Exercicios_6 {
    //6. (Lista1_06) Construa um programa em Java para ler (via teclado) uma temperatura em graus Fahrenheit, calcular e mostrar o valor correspondente em graus Celsius sabendo que TempCelsius = 5 x (TempFahrenheit – 32) / 9. (DICA: Usar dados do tipo float para ter precisão nos resultados (%.1f)).
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float TempCelsius, TempFahrenheit;

        System.out.println("defina temperatura em Fahrenheit: ");
        TempFahrenheit = ler.nextInt();

        TempCelsius = 5 * (TempFahrenheit - 32)/9;
        System.out.printf("esta é a temperatura em Celsius: %.1f", (TempCelsius));
    }
}
