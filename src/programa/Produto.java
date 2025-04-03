package programa;

public class Produto {
    private String sku;
    private String nome;
    private String descricao;
    private double valor;
    private Integer quantidade;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        return sku.equals(produto.sku);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "sku'" + sku + '\'' +
                ", nome='" + nome + '\'' +
                ", valor'=" + valor +
                '}';
    }
}
