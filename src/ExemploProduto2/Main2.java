package ExemploProduto2;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto2 produto1 = new Produto2();

        System.out.print("Digite o nome do produto 1: ");
        String nome = sc.nextLine();

        System.out.print("Digite a quantidade do produto 1: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o tipo do produto 1: ");
        String tipo = sc.nextLine();

        System.out.print("Digite o valor do produto 1: ");
        double valor = Double.parseDouble(sc.nextLine());

        produto1.inserir(nome, quantidade, tipo, valor);
        System.out.println();
        System.out.println(produto1);
        System.out.println();

        System.out.print("Digite o nome do produto 2: ");
        nome = sc.nextLine();

        System.out.println();
        Produto2 produto2 = new Produto2(nome);

        System.out.println("Dados para atualizar o produto 2: \n");

        System.out.print("Digite a quantidade do produto 2: ");
        quantidade = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o tipo do produto 2: ");
        tipo = sc.nextLine();

        System.out.print("Digite o valor do produto 2: ");
        valor = Double.parseDouble(sc.nextLine());

        produto2.inserir(nome, quantidade, tipo, valor);

        System.out.println();
        System.out.println(produto2);
        System.out.println();

        System.out.print("Digite o nome do produto 3: ");
        nome = sc.nextLine();

        System.out.print("Digite a quantidade do produto 3: ");
        quantidade = Integer.parseInt(sc.nextLine());

        System.out.println();
        Produto2 produto3 = new Produto2(nome, quantidade);
        System.out.println("Dados para atualizar o produto 3: \n");

        System.out.print("Digite o tipo do produto 3: ");
        tipo = sc.nextLine();

        System.out.print("Digite o valor do produto 3: ");
        valor = Double.parseDouble(sc.nextLine());

        produto3.inserir(nome, quantidade, tipo, valor);

        System.out.println();
        System.out.println(produto3);
        System.out.println();

        System.out.print("Digite o nome do produto 4: ");
        nome = sc.nextLine();

        System.out.print("Digite a quantidade do produto 4: ");
        quantidade = Integer.parseInt(sc.nextLine());


        System.out.print("Digite o tipo do produto 4: ");
        tipo = sc.nextLine();

        System.out.print("Digite o valor do produto 4: ");
        valor = Double.parseDouble(sc.nextLine());

        Produto2 produto4 = new Produto2(nome, quantidade, tipo, valor);

        System.out.println();
        System.out.println(produto4);
        System.out.println();

        System.out.println(produto1);
        produto1.comprar(10, 200.00);
        produto1.comprar(10);
        produto1.vender(10);
        produto1.iguais(produto4);
        System.out.println();

        System.out.println(produto2);
        produto2.comprar(5, 120.00);
        produto2.comprar(9);
        produto2.vender(50);
        produto2.iguais(produto1);
        System.out.println();

        System.out.println(produto3);
        produto3.comprar(30, 500.00);
        produto3.comprar(50);
        produto3.vender(70);
        produto3.iguais(produto2);
        System.out.println();

        System.out.println(produto4);
        produto4.comprar(23, 200.00);
        produto4.comprar(5);
        produto4.vender(80);
        produto4.iguais(produto3);

    }
}
