import java.util.Scanner;
import java.lang.Math;

public class Raizcubica {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
    System.out.println("Este programa realiza o calculo de raiz cubica");

    //Solicita e recebe a Hora do usuário
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o numero");
    double numero = scanner.nextDouble();

    // Calcula a multiplicação da hora para minuto
    double resultadoNumero = Math.cbrt(numero);


    // Exibe o resultado para usuário
    System.out.println("A raiz cubica é " + resultadoNumero);

    // Fecha o scanner para evitar vazamento de recursos
    scanner.close();
    }
}