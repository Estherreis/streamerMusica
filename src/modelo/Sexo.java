package modelo;

public enum Sexo {
MASCULINO(1, "Masculino"), FEMININO(2, "Feminino"), OUTROS(3, "Outros");
	
	private int indice;
	private String valor;
	
	private Sexo(int indice, String valor) {
		this.indice = indice;
		this.valor = valor;
	}
	
	public int getIndice() {
		return indice;
	}
	
	public String getValor() {
		return valor;
	}
	
	public Sexo valueOf(int indice) {
		for(Sexo tipo : Sexo.values()) {
			if(tipo.indice == indice) {
				return tipo;
			}
		}
		return null;
	}
}
