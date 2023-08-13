
public class Livro {
	private int id_livro;
	private String titulo;
	private String autor;
	private String situacao;

	public Livro(int id_livro, String titulo, String autor, String situacao) {
		this.id_livro = id_livro;
		this.titulo = titulo;
		this.autor = autor;
		this.situacao = situacao;
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
}
