package ExemploProduto2;

public class Produto2 {
    private static Integer codigoNovo = 1;
    private final Integer codigo;
    private String nomeDoProduto;
    private Integer quantidade;
    private String tipo;
    private Double valorDoProduto;

    public Produto2(){
        this.codigo = codigoNovo++;
    }

    public Produto2(String nomeDoProduto) {
        this.codigo = codigoNovo++;
        this.nomeDoProduto = nomeDoProduto;
    }

    public Produto2(String nomeDoProduto, Integer quantidade) {
        this.codigo = codigoNovo++;
        this.nomeDoProduto = nomeDoProduto;
        this.quantidade = quantidade;
    }

    public Produto2(String nomeDoProduto, Integer quantidade, String tipo, Double valorDoProduto) {
        this.codigo = codigoNovo++;
        this.nomeDoProduto = nomeDoProduto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valorDoProduto = valorDoProduto;
    }


    public void inserir(String nome, Integer qtd, String tipo, Double valor) {
        this.nomeDoProduto = nome;
        this.quantidade = qtd;
        this.tipo = tipo;
        this.valorDoProduto = valor;
    }

    public void vender(Integer qtd) {
        if (this.quantidade == 0 && qtd > this.quantidade) {
            System.out.println("Não disponivel no estoque");
        } else {
            System.out.printf("""
                    Foram vendidos %d unidade(s) do produto [%s]
                    Total restante de [%s] no Estoque: %d unidade(s)
                    Valor Total: R$%.2f
                    """,qtd, this.nomeDoProduto, this.nomeDoProduto, this.quantidade, (qtd * this.valorDoProduto));
        }
    }

    public void comprar(Integer qtd, Double valorDoProduto) {
        this.quantidade += qtd;
        this.valorDoProduto = valorDoProduto;
        System.out.printf("Foram comprados %d unidade(s) do produto [%s] e seu novo valor é R$%.2f\n", qtd, this.nomeDoProduto, valorDoProduto);
    }

    public void comprar(Integer qtd) {
        this.quantidade += qtd;
        System.out.printf("Foram comprados %d unidade(s) do produto [%s]\n", qtd, this.nomeDoProduto);
    }

    public void iguais(Produto2 produto){
        if(produto.nomeDoProduto.equals(this.nomeDoProduto) && produto.tipo.equals(this.tipo)){
            System.out.printf("O produto [%d] é igual ao produto [%d]\n", produto.codigo, this.codigo);
        }
        else{
            System.out.printf("O produto [%d] não é igual ao produto [%d]\n", produto.codigo, this.codigo);
        }
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " || " +
                "Produto: " + nomeDoProduto + " || " +
                "Quantidade em Estoque: " + quantidade + " || " +
                "Tipo do Produto: " + tipo + " || " +
                "Valor: R$" + String.format("%.2f", valorDoProduto);
    }
}
