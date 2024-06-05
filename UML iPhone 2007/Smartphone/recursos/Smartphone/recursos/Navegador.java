package Smartphone.recursos;

public class Navegador {

    private String paginaAtual = "";

    public void exibirPagina(String url){

        if (url.isEmpty()) {
            System.out.println("Nenhuma página selecionada.");
        } else {
            paginaAtual = url;
            System.out.println("Você acessou a URL: " + paginaAtual);
        }
    }

    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada.");
    }

    public void atualizarPagina() {
        if (paginaAtual.isEmpty()) {
            System.out.println("Selecione uma página primeiro para atualizar.");
        } else {
            System.out.println("Você atualizou a página: " + paginaAtual);
        }
    }

}
