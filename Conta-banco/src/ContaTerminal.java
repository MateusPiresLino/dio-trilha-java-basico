import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a Classe Scanner
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        var numberAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        var numberConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite seu nome!");
        var name = scanner.nextLine();

        System.out.println("Por favor, digite o saldo atual!");
        var saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque. \n", name, numberAgencia, numberConta, saldo);
        scanner.close();
    }
}
