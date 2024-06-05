package Smartphone;

import Smartphone.recursos.Navegador;
import Smartphone.recursos.Telefone;
import Smartphone.recursos.ReprodutorMusical;

public class iPhone {

    private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private Navegador navegador;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        telefone = new Telefone();
        navegador = new Navegador();
    }

    // Métodos para ReprodutorMusical
    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Métodos para Telefone
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    public void atender() {
        telefone.atender();
    }

    // Métodos para Navegador
    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();

        meuIphone.ligar("123-456-7890");
        meuIphone.atender();

        meuIphone.exibirPagina("https://www.exemplo.com");
        meuIphone.atualizarPagina();
        meuIphone.adicionarNovaAba();
    }
}
