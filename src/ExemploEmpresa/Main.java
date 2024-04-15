package ExemploEmpresa;

import javax.swing.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Empresa> empresas = new ArrayList<>();

        int opcao = JOptionPane.showConfirmDialog(null, "Cadastrar nova Empresa?");

        while(opcao == 0) {

            ArrayList<Prod> produtos = new ArrayList<>();
            Integer cnpj = Integer.parseInt(JOptionPane.showInputDialog("Digite o CNPJ da Empresa"));
            String nome = JOptionPane.showInputDialog("Digite o nome da empresa: ");
            String nomeResponsavel = JOptionPane.showInputDialog("Digite o nome do responsável");
            Integer telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do responsável"));
            Responsavel responsavel = new Responsavel(nomeResponsavel, telefone);

            Empresa empresa = new Empresa(nome, cnpj, responsavel);

            int opcaoProd = JOptionPane.showConfirmDialog(null, "Cadastrar Produtos da Empresa?");

            while(opcaoProd == 0){

                String nomeProd = JOptionPane.showInputDialog("Digite o nome do Produto");
                Integer tamanho = Integer.valueOf(JOptionPane.showInputDialog("Digite o tamanho do Produto"));
                String tipo = JOptionPane.showInputDialog("Digite o tipo do Produto");
                String cor = JOptionPane.showInputDialog("Digite a cor do Produto");
                String espec = JOptionPane.showInputDialog("Digite a especificação do Produto");

                Prod prod = new Prod(nomeProd, tamanho, tipo, cor, espec);
                produtos.add(prod);
                opcaoProd = JOptionPane.showConfirmDialog(null, "Continuar Cadastrando Produtos?\n (Produtos Cadastrados: " + produtos.size() + ")");
            }

            empresa.setProdutos(produtos);
            empresas.add(empresa);
            opcao = JOptionPane.showConfirmDialog(null, "Cadastrar nova Empresa?\n(Empresas Cadastradas: " + empresas.size() + ")");
        }

        for(Empresa empresa : empresas){
            JOptionPane.showMessageDialog(null, empresa);
        }

    }
}
