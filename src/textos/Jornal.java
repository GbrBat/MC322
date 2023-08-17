package textos;

public class Jornal {
	private int id_jornal;
	private String empresa;
	private String data_publicacao;
	private String situacao;

	public Jornal(int id_jornal, String empresa, String data_publicacao, String situacao) {
		this.id_jornal = id_jornal;
		this.empresa = empresa;
		this.data_publicacao = data_publicacao;
		this.situacao = situacao;
	}

	public int getId_jornal() {
		return id_jornal;
	}

	public void setId_jornal(int id_jornal) {
		this.id_jornal = id_jornal;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getData_publicacao() {
		return data_publicacao;
	}

	public void setData_publicacao(String data_publicacao) {
		this.data_publicacao = data_publicacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
}
