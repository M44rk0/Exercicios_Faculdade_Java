package ExercicioHeranca2;

public class Gerente extends Funcionario{

    private Double bonificacao;
    private Tipo tipo;

    public Gerente(String nome, Integer matricula) {
        super(nome, matricula);
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Double getSalarioFinal(){
        return salario + bonificacao;
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "Salário Base: R$" + String.format("%.2f", getSalario()) + "\n" +
                "Bonificação Mensal: R$" + String.format("%.0f", getBonificacao()) + "\n" +
                "Salário Final: R$" + String.format("%.2f", getSalarioFinal()) + "\n" +
                "Tipo: " + getTipo() + "\n" +
                "Salário Anual: R$" + String.format("%.2f", salarioAnual());
    }
}
