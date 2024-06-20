package BancoPOO;

public class Banco {

    public static Conta criarContaCorrente(Cliente dono){
        return new ContaCorrente(dono);
    }

    public static Conta criarContaPoupanca(Cliente dono){
        return new ContaPoupanca(dono);
    }

    public static void main(String[] args) {

        System.out.println("\nCLIENTES\n");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Victor", 111222333, "1111-1111");
        System.out.println(cliente1);

        Cliente cliente2 = new Cliente("Ana Maria", 222333444, "2222-2222");
        System.out.println(cliente2);

        System.out.println("\nCONTAS");

        Conta contaCorrente1 = criarContaCorrente(cliente1);
        contaCorrente1.imprimirExtrato();

        Conta contaCorrente2 = criarContaCorrente(cliente2);
        contaCorrente2.imprimirExtrato();

        contaCorrente1.depositar(500.00);
        contaCorrente2.depositar(200.00);

        System.out.println("\nNOVOS SALDOS");
        contaCorrente1.imprimirExtrato();
        contaCorrente2.imprimirExtrato();

        System.out.println("\nSALDOS DEPOIS DA TRANNSFERÊNCIA");
        contaCorrente1.transferir(400, contaCorrente2);
        contaCorrente1.imprimirExtrato();
        contaCorrente2.imprimirExtrato();

    }
}
