package ExercicioHeranca2;

public class Cliente extends Pessoa{

    private Integer idade;
    private String cpf;
    private Status status;

    public Cliente(String nome, Integer telefone, Integer idade, String cpf) {
        super(nome, telefone);
        this.idade = idade;
        this.cpf = cpf;
        this.status = Status.ATIVO;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static void desativar(Cliente cliente){
        if (cliente.status == Status.ATIVO) {
            cliente.setStatus(Status.INATIVO);
        }
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Status: " + getStatus() + "\n";
    }

}
