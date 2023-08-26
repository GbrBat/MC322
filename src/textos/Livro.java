package textos;
import local.Biblioteca;

public class Livro {
	private int id_livro;
    private String titulo;
    private String autor;
    private String situacao;
    private Biblioteca biblioteca; // Adicionando referência a biblioteca

    public Livro(int id_livro, String titulo, String autor, String situacao, Biblioteca biblioteca) {
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.situacao = situacao;
        this.biblioteca = biblioteca; // Associando o livro a biblioteca
    }

	public int getId_livro() {
		return id_livro;
	}

	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
}
