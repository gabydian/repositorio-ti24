import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Produtos {

    private List<Produto> listaProdutos;
    
    public List<Produto> getListaProdutos(){
    	return Collections.unmodifiableList(listaProdutos);
    }

    public void adicionarProduto(Produto novoProduto) {

        if (listaProdutos == null) {
            listaProdutos = new ArrayList<>();
        }

        listaProdutos.add(novoProduto);
    }

    public int filtrarQuantidadePorNome(String nomeInformado) {

            return filtrarProdutosPorNome(nomeInformado).size();
    }
    public List<Produto> filtrarProdutoPorNome(String nomeInformado) {

        List<Produto> filtrados = new ArrayList<>();
    	
    	for (Produto produto : listaProdutos) {
    	
    		if (produto.getNome().equalsIgnoreCase (nomeInformado)) {
    			filtrados.add(produto);
    		}
    	}
    	return filtrados;
    }
}