package ExercicioHeranca2;

public class Caixa extends Funcionario{

    private Integer horario;

    public Caixa(String nome, Integer matricula) {
        super(nome, matricula);
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "Salário: R$" + String.format("%.2f", getSalario()) + "\n" +
                "Horário: " + getHorario() + "\n" +
                "Salário Anual: R$" + String.format("%.2f", salarioAnual());
    }

}
