package servicos;

public class JurosEUA implements Juros {

	private Double juros;

	public JurosEUA(Double juros) {
		this.juros = juros;
	}

	@Override
	public Double getJuros() {
		return juros;
	}

}
