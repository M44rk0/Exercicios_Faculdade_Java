package ExercicioHeranca2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Cadastro {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome do Funcionário (Caixa): ");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do Funcionário (Caixa): "));

        Caixa caixa = new Caixa(nome, matricula);

        caixa.setHorario(Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o horário do Caixa")));
        caixa.setTelefone(Integer.valueOf(JOptionPane.showInputDialog("Digite o telefone do Caixa: ")));
        caixa.setSalario(Double.valueOf(JOptionPane.showInputDialog("Digite o salário do Caixa: ")));

        JOptionPane.showMessageDialog(null, caixa, "Dados do Funcionário (Caixa)", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Aumentando salário em 10%...", "Aumento de Salário", JOptionPane.WARNING_MESSAGE);
        caixa.setSalario(caixa.getSalario() + caixa.getSalario() * 0.1);
        JOptionPane.showMessageDialog(null, caixa, "Dados Atualizados", JOptionPane.INFORMATION_MESSAGE);

        nome = JOptionPane.showInputDialog("Digite o nome do Funcionário (Gerente): ");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do Funcionário (Gerente): "));

        Gerente gerente = new Gerente(nome, matricula);

        gerente.setTelefone(Integer.valueOf(JOptionPane.showInputDialog("Digite o telefone do Gerente: ")));
        gerente.setSalario(Double.valueOf(JOptionPane.showInputDialog("Digite o salário do Gerente: ")));
        gerente.setBonificacao(Double.valueOf(JOptionPane.showInputDialog("Digite a bonificação Mensal do Gerente: ")));
        gerente.setTipo(JOptionPane.showOptionDialog(null, "Escolha o tipo do Gerente: ",
                "Tipo do Gerente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"Pessoa Física", "Pessoa Jurídica"},
                null) == 0 ? Tipo.PESSOA_FISICA : Tipo.PESSOA_JURIDICA);

        JOptionPane.showMessageDialog(null, gerente, "Dados do Funcionário (Gerente)", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Aumentando salário em 20%...", "Aumento de Salário", JOptionPane.WARNING_MESSAGE);
        gerente.setSalario(gerente.getSalario() + gerente.getSalario() * 0.2);
        JOptionPane.showMessageDialog(null, gerente, "Dados Atualizados", JOptionPane.INFORMATION_MESSAGE);

        Cliente cliente1 = new Cliente("Pedro", 98765321, 45, "041923234");
        Cliente cliente2 = new Cliente("João", 93454638, 25, "081129237");
        Cliente cliente3 = new Cliente("Maria", 94454677, 23, "021956232");

        ArrayList<Cliente> clientes = new ArrayList<>(Arrays.asList(cliente1, cliente2, cliente3));

        JOptionPane.showMessageDialog(null, "Clientes: \n" +
                cliente1 + "\n " + cliente2 + "\n " + cliente3, "Lista de Clientes", JOptionPane.INFORMATION_MESSAGE);

        String[] options = {cliente1.getNome(), cliente2.getNome(), cliente3.getNome()};

        int option = JOptionPane.showOptionDialog(null, "Escolha um Cliente para inativar",
                "Inativar Clientes",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        Cliente.desativar(clientes.get(option));

        JOptionPane.showMessageDialog(null, "Clientes: \n" +
                cliente1 + "\n " + cliente2 + "\n " + cliente3, "Lista de Clientes Atualizada", JOptionPane.INFORMATION_MESSAGE);
    }
}
