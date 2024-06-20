package BancoPOO;

public class Cliente {
    private String nome;
    private int cpf;
    private String telefone;

    public Cliente(String nome, Integer cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
