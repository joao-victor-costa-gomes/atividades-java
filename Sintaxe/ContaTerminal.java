import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da sua agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a sua agência: ");
        String nomeAgencia = scanner.nextLine();

        System.out.println("Informe o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira o seu saldo atual: ");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo de  R$" + saldoCliente + " já está disponível para saque.");
    }
}
