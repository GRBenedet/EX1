import java.util.Scanner;

public class Exercicios_3 {
    //Construa um programa em Java para ler (via teclado) quatro números do tipointeiro, calcule e mostre o resultado da média aritmética entre eles. Usar “float” para o tipode dado da variável que irá armazenar o resultado da média aritmética e imprimir o resultadocom duas casas decimais depois da vírgula (%.2f).//
   
public static void main(String[] args) {
        int valor1, valor2, valor3, valor4;
        float resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Primeiro valor : ");
            valor1 = ler.nextInt();
            System.out.println("Segundo valor : ");
            valor2 = ler.nextInt();
            System.out.println("Terceiro valor : ");
            valor3 = ler.nextInt();
            System.out.println("quarto valor : ");
            valor4 = ler.nextInt();

            resultado = ((valor1 + valor2 + valor3 + valor4)/4);

            System.out.printf("A media aritimedica é: = %.2f", (resultado));

    }
}
