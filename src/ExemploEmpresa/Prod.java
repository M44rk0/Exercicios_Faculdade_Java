package ExemploEmpresa;

public class Prod {
    private String nome;
    private Integer tamanho;
    private String tipo;
    private String cor;
    private String especificacao;

    public Prod(String nome, Integer tamanho, String tipo, String cor, String especificacao) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
        this.especificacao = especificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Tamanho: " + tamanho + "\n"
                + "Tipo: " + tipo + "\n"
                + "Cor: " + cor + "\n"
                + "Especificação: " + especificacao + "\n";
    }
}
