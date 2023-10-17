package servicos;

public interface Juros {

	public Double getJuros();

	default Double pagamento(Double quantia, Integer meses) {

		return quantia + (((quantia / 100) * getJuros()) * meses);

	}

}
