import java.util.List;
public class PedidoVenda {
    FormaPagamento formaPagamento;
    Frete frete;
    Cliente cliente;
    public String descricao;
    public String dataVenda;
    public String status;
    private List <Produto> listaProdutos;
    public double getvalorTotal() {
        double valorTotal = 0;

        for (int i = 0; i < listaProdutos.size(); i++) {
            // acessar um elemento da lista
            Produto produto = listaProdutos.get(i);
            // somar valor
            valorTotal = valorTotal + produto.getValorUnitario();
        }
            return valorTotal;
    }
    public double valorItens;

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }


}
