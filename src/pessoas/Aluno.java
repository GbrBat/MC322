package pessoas;

public class Aluno {
	private int id_aluno;
	private String nome;
	private String curso;
	private int ra;
	
	public Aluno (int id_aluno, String nome, String curso, int ra) {
		this.id_aluno = id_aluno;
		this.nome = nome;
		this.curso = curso;
		this.ra = ra;
	}
	
	public void emprestar() {}
	
	public void devolver() {}

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
	
}
