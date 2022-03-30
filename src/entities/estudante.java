package entities;

public class estudante {

	private String nome;
	private String email;
	public int quarto;
	
	
	
	public estudante() {
	
	}



	public estudante(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
		
	}



	private String getNome() {
		return nome;
	}



	private void setNome(String nome) {
		this.nome = nome;
	}



	private String getEmail() {
		return email;
	}



	private void setEmail(String email) {
		this.email = email;
	}
	
	public String tostring()
	{
		return "Nome: " + nome + ", " + "Email: " + email;
	}
	
}
