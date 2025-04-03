package programa;

public class Application {
    static ProdutoRepository repository = new ProdutoRepository();

    public Application(ProdutoRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        populaBase();

        //Imprime todos os produtos do estoque
        imprimeProduto();

        Produto bySku = repository.getBySku("RS002");
        System.out.println("Produto: " + bySku);

        Produto novoProduto = new Produto();
        novoProduto.setSku("A555");
        novoProduto.setNome("Fonte");
        novoProduto.setDescricao("Fonte 700w");
        novoProduto.setValor(199.90);
        novoProduto.setQuantidade(50);
        repository.save(novoProduto);

        Produto updateProduto = new Produto();
        updateProduto.setSku("RS001");
        updateProduto.setNome("Mouse Gamer");
        updateProduto.setDescricao("Mouse Gamer");
        updateProduto.setValor(99.90);
        updateProduto.setQuantidade(100);
        repository.updateBySku(updateProduto);

        //-- Deleta produtos
        deletarProduto();

        //-- Imprime estoque sem os produtos deletados
        imprimeProduto();
    }

    private static void imprimeProduto() {
        System.out.println(repository.getEstoque());
    }

    private static void populaBase() {
        Produto p1 = new Produto();
        p1.setSku("RS001");
        p1.setNome("Mouse");
        p1.setDescricao("Mouse Gamer");
        p1.setValor(89.90);
        p1.setQuantidade(10);
        repository.addEstoque(p1);

        Produto p2 = new Produto();
        p2.setSku("RS002");
        p2.setNome("Teclado");
        p2.setDescricao("Teclado Gamer");
        p2.setValor(119.90);
        p2.setQuantidade(50);
        repository.addEstoque(p2);

        Produto p3 = new Produto();
        p3.setSku("RS003");
        p3.setNome("Fone de ouvido");
        p3.setDescricao("Fone de ouvido Gamer");
        p3.setValor(159.90);
        p3.setQuantidade(30);
        repository.addEstoque(p3);
    }

    private static void deletarProduto(){
        Produto p1 = repository.getBySku("RS003");
        repository.delete(p1);
    }
}
