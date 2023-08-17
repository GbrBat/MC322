package pessoas;

public class Professor {
	private int id_professor;
	private String nome;
	private String disciplina;
	private String sala_atendimento;
	
	public Professor (int id_professor, String nome, String disciplina, String sala_atendimento) {
		this.id_professor = id_professor;
		this.nome = nome;
		this.disciplina = disciplina;
		this.sala_atendimento = sala_atendimento;
	}
	
	public int getId_professor() {
		return id_professor;
	}
	
	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getSala_atendimento() {
		return sala_atendimento;
	}
	
	public void setSala_atendimento(String sala_atendimento) {
		this.sala_atendimento = sala_atendimento;
	}
}
