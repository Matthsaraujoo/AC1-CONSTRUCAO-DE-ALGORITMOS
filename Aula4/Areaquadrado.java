import java.util.Scanner;

public class Areaquadrado {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo da area do quadrado.");

        // Solicita e recebe o número do lado do quadrado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do lado: ");
        int Numerolado = scanner.nextInt();

        // Calcula a area do quadrado
        int resultadoarea = 2 * Numerolado;

        // Exibe o resultado para o usuário
        System.out.println("A area do quadrado = " + resultadoarea);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}