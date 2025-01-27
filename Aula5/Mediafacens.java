import java.util.Scanner;

public class Mediafacens {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calcula da média. ");

        // Solicita e recebe o número da AC1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da AC1: ");
        double AC1 = scanner.nextDouble();

        // Solicita e recebe o numero da AC2
        System.out.print("Digite o número da AC2: ");
        double AC2 = scanner.nextDouble();

        // Solicitar o numero da AG
        System.out.print("Digite o número da AG: ");
        double AG = scanner.nextDouble();

        // Solicitar e receber o número da AF
        System.out.print("Digite o número AF: ");
        double AF = scanner.nextDouble();

        // Calcula a média dos números 
        double resultado = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45)/1;

        // Exibe o resultado para o usuário
        System.out.println("A média é " + resultado);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}