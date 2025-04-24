import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        // Declaração de variáveis
        double cel, fah; // cel - temperatura em graus celsius; fah - temperatura em graus fahrenheit
        int op; // Opção do usuário

        // Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        // Apresentação do programa
        System.out.println("\n\t\t\t -- Conversor -- \n");

        // Menu
        System.out.println("1. °C para °F");
        System.out.println("2. °F para °C");
        System.out.println("3. Sair");

        // Ler a opção escolhida pelo usuário
        System.out.print("\nOpção: ");
        op = entrada.nextInt();

        // Entradas e processamento conforme a opção
        if (op == 1) {
            // Converter Celsius para Fahrenheit
            System.out.print("Informe a temperatura em °C: ");
            cel = entrada.nextDouble();

            // Processamento
            fah = (cel * 9 / 5.0) + 32;

            // Saída
            System.out.println("\n" + cel + "°C = " + fah + "°F\n");
        } else if (op == 2) {
            // Converter Fahrenheit para Celsius
            System.out.print("Informe a temperatura em °F: ");
            fah = entrada.nextDouble();

            // Processamento
            cel = (fah - 32) * 5 / 9.0;

            // Saída
            System.out.println("\n" + fah + "°F = " + cel + "°C\n");
        } else if (op == 3) {
            System.out.println("\nAbraço!!!");
        } else {
            System.out.println("Opção " + op + " incorreta!");
        }

        // Fechar o scanner
        entrada.close();
    }
}
