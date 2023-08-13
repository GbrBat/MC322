
public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(1, "Gabriel", "Ciência da Computação", 123456);
		Livro livro1 = new Livro(1, "Livros", "Autorr", "Disponivel");
		String nome = aluno1.getNome();
		String curso = aluno1.getCurso();
		String titulo = livro1.getTitulo();
		String autor = livro1.getAutor();

		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Curso do Aluno: " + curso);
		System.out.println("Titulo do Livro: " + titulo);
		System.out.println("Autor do Livro: " + autor);
	}
}
