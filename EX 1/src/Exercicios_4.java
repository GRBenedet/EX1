import java.util.Scanner;

public class Exercicios_4 {
    //(Lista1_04) Construa um programa em Java que leia um número do tipo “inteiro” (viateclado) e o guarde em uma variável X. Calcule e mostre: (1) o conteúdo de X, (2) o quadradode X, (3) o resto da divisão inteira de X por 3, (4) a metade de X, e (5) o resultado do produtode X pela metade de X.//
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num, numQ, numD; 
        float numM, numMM;
        
        System.out.println("Valor: ");
        num = ler.nextInt();
        
        System.out.printf( "Este é seu valor: %d %n", (num));
        
        numQ = (num * num);
        System.out.printf( "Este é o quadrado do seu valor: %d %n", (numQ));

        numD = (num/3);
        System.out.printf( "Este é seu valor dividido por 3: %d %n", (numD));

        numM = (num/2);
        System.out.printf( "Este é a metade de seu valor: %.2f %n", (numM));

        numMM = (num/numM);
        System.out.printf( "Este é o produdo da metade do seu valor: %.2f", (numMM));

    }
}
