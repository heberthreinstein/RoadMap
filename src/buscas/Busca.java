package buscas;

import nos.No;

public abstract class Busca {
	private int valorBusca;
	private String textoResposta;
	
	public abstract boolean buscarResultado(No no);
	public abstract int contarNosFolha();
	
	protected void obterResultadoPaternal(No no) {
		String retorno = "";
		No noValor = no;
		retorno += getCity(noValor.getValor());
		while (noValor.getNoPai() != null) {
			noValor = noValor.getNoPai();
			retorno = getCity(noValor.getValor()) + " | " + retorno;
		}
		this.textoResposta = retorno;
	}
	
	protected String getCity(int number) {
		String ret = "";
		
		switch(number) {
		case 0:
			ret = "losSantos";
			break;
		case 1:
			ret = "lasVenturas";
			break;
		case 2:
			ret = "sanFierro";
			break;
		case 3:
			ret = "montegomery";
			break;
		case 4:
			ret = "redCountry";
			break;
		case 5:
			ret = "blueberry";
			break;
		case 6:
			ret = "fortZancudo";
			break;
		case 7: 
			ret = "ratonCanyon";
			break;
		case 8:
			ret = "boneCountry";
			break;
		case 9:
			ret = "palominoCreek";
			break;
		}
		
		return ret;
	}
	
	public void exibirTextoResultado() {
		if (this.textoResposta != null) {
			System.out.println("Eu passei por: " + this.textoResposta);
		} else {
			System.out.println("Nessa cidade " + this.valorBusca + ", eu aonda não fui!.");
		}
	}
	
	public String getTextoResposta() {
		return textoResposta;
	}

	public void setTextoResposta(String textoResposta) {
		this.textoResposta = textoResposta;
	}
	
	public void setValorBusca(int valorBusca) {
		this.valorBusca = valorBusca;
	}
	
	public boolean isResultadoBusca(No no) {
		return no.getValor() == valorBusca;
	}
	
	public int getValorBusca() {
		return valorBusca;
	}
	
}
