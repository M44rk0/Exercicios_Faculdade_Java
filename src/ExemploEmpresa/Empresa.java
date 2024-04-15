package ExemploEmpresa;

import java.util.ArrayList;

public class Empresa {
    private String nomeDaEmpresa;
    private Integer cnpj;
    private Responsavel responsavel;
    private ArrayList<Prod> produtos;

    public Empresa(String nomeDaEmpresa, Integer cnpj, Responsavel responsavel) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
    }

    public Empresa(String nomeDaEmpresa, Integer cnpj, Responsavel responsavel, ArrayList<Prod> produtos) {
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.produtos = produtos;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public ArrayList<Prod> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Prod> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa: ").append(nomeDaEmpresa).append("\n");
        sb.append("CNPJ: ").append(cnpj).append("\n");
        sb.append("Responsável: ").append(responsavel.getNome()).append("\n");
        sb.append("Produtos: \n");

        if (!produtos.isEmpty()){
            for(Prod prod : produtos){
                sb.append(prod.toString()).append("\n");
            }
        } else {
            sb.append("Nenhum Produto Cadastrado");
        }

        return sb.toString();
    }
}
