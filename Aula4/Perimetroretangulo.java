import java.util.Scanner;

public class Perimetroretangulo {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo do perimetro do retangulo.");

        // Solicita e recebe o número base do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número base: ");
        int Numerobase = scanner.nextInt();

        // Solicita e recebe o número da altura
        System.out.print("Digite o número da altura: ");
        int Numeroaltura = scanner.nextInt();

        // Calcula o perimetro
        int resultadoperimetro = 2 * (Numerobase + Numeroaltura);

        // Exibe o resultado para o usuário
        System.out.println("O perimetro é " + resultadoperimetro);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}