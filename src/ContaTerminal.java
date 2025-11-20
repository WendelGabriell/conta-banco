import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String numeroAgencia;
        String nomeUsuario;
        double saldoUsuario;

        System.out.println("Por favor, digite o número da sua conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Número da Agência: ");
        numeroAgencia = scanner.next();
        scanner.nextLine();

        System.out.println("Nome e Sobrenome: ");
        nomeUsuario = scanner.nextLine();

        System.out.println("Saldo atual: ");
        saldoUsuario = scanner.nextDouble();

        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta + " + numeroConta + " e seu saldo " + String.format("%.2f", saldoUsuario) + " já está disponível para saque.");
        
    }
}
