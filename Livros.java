import java.util.ArrayList;
import java.util.List;

public class Livros {

    private List<Livro> listaLivros;
    private int qtdLivrosAutor;

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void adicionarLivro (Livro novoLivro) {
        if (listaLivros == null) {
            listaLivros = new ArrayList<>();
        }
        listaLivros.add(novoLivro);
    }

    public int filtrarQuantidadePorAutor(String nomeInformado) {
        return qtdLivrosAutor;
    }

    public int filtrarLivrosPorAutor(String nomeInformado) {
        List<Livro> filtradosLivros = new ArrayList<>();

        for (Livro novoLivro : listaLivros) {

            if (novoLivro.getNome().equalsIgnoreCase (nomeInformado)) {
                filtradosLivros.add(novoLivro);
            }
        }
        return filtradosLivros;
    }
}
    }
}
