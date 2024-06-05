package Smartphone.recursos;

public class ReprodutorMusical {

    private boolean tocando = false;
    private String musicaAtual = "";

    public void tocar(){
        if (musicaAtual.isEmpty()) {
            System.out.println("Nenhuma música foi selecionada");
        } else {
            tocando = true;
            System.out.println("Tocando a música: " + musicaAtual);
        }

    }

    public void pausar(){
        if (tocando == false){
            System.out.println("A música já está pausada.");
        } else {
            tocando = false;
        }
    }

    public void selecionarMusica(String musica){
        musicaAtual = musica;
        System.out.println("Você selecionou a música: " + musicaAtual);
    }
}
