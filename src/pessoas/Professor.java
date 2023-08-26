package pessoas;
import textos.Livro;

public class Professor {
	private int id_professor;
    private String nome;
    private String disciplina;
    private String sala_atendimento;
    private Livro[] livrosRecomendados; // Array de livros recomendados
    private int numLivrosRecomendados;

    public Professor(int id_professor, String nome, String disciplina, String sala_atendimento, int maxLivros) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.disciplina = disciplina;
        this.sala_atendimento = sala_atendimento;
        this.livrosRecomendados = new Livro[maxLivros];
        this.numLivrosRecomendados = 0;
    }
    
    public void recomendarLivro(Livro livro) {
        if (numLivrosRecomendados < livrosRecomendados.length) {
            livrosRecomendados[numLivrosRecomendados] = livro;
            numLivrosRecomendados++;
        }
    }

    public Livro[] getLivrosRecomendados() {
        return livrosRecomendados;
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
