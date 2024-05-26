import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;
import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        //String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        //analisarSalario(2000, 1800);
        //analisarSalario(2000, 2000);
        //analisarSalario(2000, 3000);

        //analisarSalarioCandidato();

        //imprimirSelecionados();

        /*for(String candidato : candidatosSelecionados){
            ligarParaCandidato(candidato);
        }*/
    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    public static void analisarSalario(double salarioBase, double salarioPretendido){
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public static void analisarSalarioCandidato(){
        double salarioBase = 2000.0;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalSelecionados = 0;
        int proximoCandidato = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        while (totalSelecionados < 5 && proximoCandidato < candidatos.length){
            double salarioPretendido = valorPretendido();
            String salarioPretendidoFormatado = decimalFormat.format(salarioPretendido);
            String nomeCandidato = candidatos[proximoCandidato];
            System.out.println("O candidato " + nomeCandidato + " está pedindo R$" + salarioPretendidoFormatado);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + nomeCandidato + " foi selecionado!");
                totalSelecionados++;
            } else {
                System.out.println("O candidato " + nomeCandidato + " NÃO foi selecionado!");
            }
            proximoCandidato++;
        }
        System.out.println("Total de selecionados: " + totalSelecionados);
        System.out.println("Total de consultados: " + proximoCandidato);
    }

    static void imprimirSelecionados(){
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        int indice = 1;
        for(String candidato : candidatosSelecionados){
            System.out.println(indice + "º canditado: " + candidato);
            indice++;
        }
    }

    static void ligarParaCandidato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }
}
