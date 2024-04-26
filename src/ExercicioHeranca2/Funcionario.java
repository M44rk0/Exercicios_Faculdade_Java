package ExercicioHeranca2;

public class Funcionario extends Pessoa{

    private Integer matricula;
    protected Double salario;

    public Funcionario(String nome, Integer matricula){
        super(nome);
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double salarioAnual(){
        return salario * 12;
    }

}
