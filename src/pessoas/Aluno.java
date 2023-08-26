package pessoas;
import textos.Livro;

public class Aluno {
	private int id_aluno;
	private String nome;
	private String curso;
	private int ra;
	private int emprestimos_permitidos;
	private int emprestimos = 0;
	private Livro[] livros_emprestados;
	
	public Aluno (int id_aluno, String nome, String curso, int ra, int emprestimos_permitidos) {
		this.id_aluno = id_aluno;
		this.nome = nome;
		this.curso = curso;
		this.ra = ra;
		this.emprestimos_permitidos = emprestimos_permitidos;
		this.livros_emprestados = new Livro[emprestimos_permitidos];
		}
	
	
	public void emprestar(Livro livro) {
		if (emprestimos < emprestimos_permitidos) {
			livros_emprestados[emprestimos] = livro;
			emprestimos++;
		} else {
			System.out.println("Esse aluno não pode emprestar mais livros");
		}
	}
	
	public void devolver(Livro livro) {
		for (int i = 0; i < emprestimos; i++) {
			 if (livros_emprestados[i] == livro) {
	                livros_emprestados[i] = null;
	                rearranjarArray();
	                emprestimos--;
	                return;
			 }
		}
	}
	
	private void rearranjarArray() {
        for (int i = 0; i < emprestimos; i++) {
            if (livros_emprestados[i] == null && i < emprestimos - 1) {
                livros_emprestados[i] = livros_emprestados[i + 1];
                livros_emprestados[i + 1] = null;
            }
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public int getEmprestimos_permitidos() {
		return emprestimos_permitidos;
	}

	public void setEmprestimos_permitidos(int emprestimos_permitidos) {
		this.emprestimos_permitidos = emprestimos_permitidos;
	}


	public int getEmprestimos() {
		return emprestimos;
	}


	public void setEmprestimos(int emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	public String[] getLivrosEmprestados() {
        String[] livrosEmprestados = new String[emprestimos];
        for (int i = 0; i < emprestimos; i++) {
            livrosEmprestados[i] = livros_emprestados[i].getTitulo();
        }
        return livrosEmprestados;
    }
	
}
