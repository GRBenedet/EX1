import java.util.Scanner;

public class Exercicios_5 {
    //(Lista1_05) Construa um programa em Java para ler (via teclado) o raio de um círculo,calcular a área deste círculo e mostrar o resultado. (DICA: Cálculo da área = (PI * (raio * raio)). Usar dados do tipo float para ter precisão nos resultados (%.2f). Usar pi = 3.141592).

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float raio, area, pi = (float) 3.141592;

        System.out.println("Defina raio em metros: ");
        raio = ler.nextInt();

        area = (pi *(raio * raio));
        System.out.printf("A area do circulo é: %.2f", (area));





    }
}
