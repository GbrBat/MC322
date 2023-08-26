package local;
import textos.Livro;

public class Biblioteca {
	private Livro[] livros;

    public Biblioteca(int tamanhoMaximo) {
        livros = new Livro[tamanhoMaximo];
    }

    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                return;
            }
        }
        System.out.println("Biblioteca cheia, não é possível adicionar mais livros.");
    }
}
