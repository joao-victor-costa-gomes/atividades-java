package BancoPOO;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private Cliente cliente;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Sem saldo suficiente para sacar.");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        if (saldo < valor){
            System.out.println("Sem saldo suficiente para transferir.");
        } else {
            contaDestino.saldo += valor;
            saldo -= valor;
        }
    }

    public void verificarSaldo(){
        double saldoAtual = getSaldo();
        System.out.println("Saldo atual de " + cliente.getNome() + ": " + saldoAtual);
    }

    public void imprimirExtrato() {
        System.out.println("\nCliente: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

}
