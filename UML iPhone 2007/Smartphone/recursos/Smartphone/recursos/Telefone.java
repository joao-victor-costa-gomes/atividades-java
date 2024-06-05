package Smartphone.recursos;

public class Telefone {

    public void ligar(String numero){
        System.out.println("Você ligou para o número: " + numero);
        iniciarCorreioVoz();
    }

    public void atender(){
        System.out.println("Você atendeu a chamada.");
        iniciarCorreioVoz();
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado.");
    }
}
