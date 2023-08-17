import pessoas.Aluno;
import pessoas.Professor;
import textos.Livro;
import textos.Jornal;

public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(1, "Gabriel", "Ciência da Computação", 123456);
		Livro livro1 = new Livro(1, "Livros", "Autorr", "disponivel");
		Professor prof1 = new Professor(1,"Bruno Cafeo", "Programação Orientada a Objetos", "IC 1 - Sala 4");
		Jornal jornal1 = new Jornal(1,"Folha", "14 de Agosto de 2023", "indisponivel");
		String nome = aluno1.getNome();
		String curso = aluno1.getCurso();
		String titulo = livro1.getTitulo();
		String autor = livro1.getAutor();
		String prof_nome = prof1.getNome();
		
		jornal1.setSituacao("disponivel");
		String nome_jornal= jornal1.getEmpresa();
		String situ_jornal = jornal1.getSituacao();

		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Curso do Aluno: " + curso);
		System.out.println("Titulo do Livro: " + titulo);
		System.out.println("Autor do Livro: " + autor);
		System.out.println("O jornal " + nome_jornal + " encontra-se " + situ_jornal);
		System.out.println("O professor " + prof_nome + " veio buscar o jornal " + nome_jornal + " e este estava " + situ_jornal);
	}
}
