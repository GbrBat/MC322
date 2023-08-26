import pessoas.Aluno;
import pessoas.Professor;
import textos.Livro;
import textos.Jornal;
import local.Biblioteca;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca(100); // Cria uma biblioteca com capacidade para 100 livros
		
        Livro livro1 = new Livro(1, "Livro 1", "Autor 1", "disponivel", biblioteca);
        Livro livro2 = new Livro(2, "Livro 2", "Autor 2", "disponivel", biblioteca);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        
        Professor prof1 = new Professor(1,"Bruno Cafeo", "Programação Orientada a Objetos", "IC 1 - Sala 4", 5);
        Aluno aluno1 = new Aluno(1, "Gabriel", "Ciência da Computação", 123456, 3);
        
        aluno1.emprestar(livro1);
        aluno1.emprestar(livro2);
        aluno1.devolver(livro1);
        
        prof1.recomendarLivro(livro1);
        prof1.recomendarLivro(livro2);
        
        System.out.println("Livros recomendados pelo professor " + prof1.getNome() + ":");
        for (Livro livro : prof1.getLivrosRecomendados()) {
            if (livro != null) {
                System.out.println("- " + livro.getTitulo());
            }
        }
        
        String[] livrosEmprestados = aluno1.getLivrosEmprestados();
        System.out.println("Livros emprestados por " + aluno1.getNome() + ":");
        for (String livro : livrosEmprestados) {
            System.out.println("- " + livro);
        }		
	}
}
