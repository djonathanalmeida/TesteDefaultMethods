package servicos;

public class JurosBrasil implements Juros {

	private Double juros;

	public JurosBrasil(Double juros) {
		this.juros = juros;
	}

	@Override
	public Double getJuros() {
		return juros;
	}
	
}

