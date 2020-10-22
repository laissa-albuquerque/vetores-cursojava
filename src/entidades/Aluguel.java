package entidades;

public class Aluguel {

	private String nomeEstudante;
	private String emailEstudante;
	private Integer numQuarto;

	public Aluguel(String nomeEstudante, String emailEstudante, Integer numQuarto) {
		this.nomeEstudante = nomeEstudante;
		this.emailEstudante = emailEstudante;
		this.numQuarto = numQuarto;
	}

	public Aluguel(String nomeEstudante, String emailEstudante) {
		this.nomeEstudante = nomeEstudante;
		this.emailEstudante = emailEstudante;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public String getEmailEstudante() {
		return emailEstudante;
	}

	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}

	public Integer getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	@Override
	public String toString() {
		return "Quarto [Quarto = " + numQuarto
				+ ", Nome = " + nomeEstudante + ", Email = " + emailEstudante + "]";
	}

}
