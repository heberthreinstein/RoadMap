package ai;

import buscas.BuscaEmLargura;
import jade.core.Agent;
import nos.No;

public class Traveler extends Agent {
	private static final long serialVersionUID = 1L;

	protected void setup() {
		No losSantos = new No(0);
		No lasVenturas = new No(1);
		No sanFierro = new No(2);
		No montegomery = new No(3);
		No redCountry = new No(4);
		No blueberry = new No(5);
		No fortZancudo = new No(6);
		No ratonCanyon = new No(7);
		No boneCountry = new No(8);
		No palominoCreek = new No(9);
		int cityDestination = 0;

		
		losSantos.setNoEsquerda(lasVenturas);
		losSantos.setNoCentro(montegomery);
		losSantos.setNoDireita(sanFierro);
		
		lasVenturas.setNoDireita(montegomery);
		
		montegomery.setNoDireita(redCountry);
		
		sanFierro.setNoDireita(fortZancudo);		
		
		redCountry.setNoCentro(blueberry);
		redCountry.setNoDireita(fortZancudo);
		
		fortZancudo.setNoEsquerda(ratonCanyon);
		
		ratonCanyon.setNoCentro(boneCountry);
		ratonCanyon.setNoDireita(palominoCreek);
		
		Object[] args = getArguments();
		
		if(args != null && args.length > 0) {
			String city = (String) args[0];
			
			System.out.println("Olá, eu sou "+ getLocalName());
			
			switch(city) {
				case "lasVenturas":
					cityDestination = 1;
					break;
				case "sanFierro":
					cityDestination = 2;
					break;
				case "montegomery":
					cityDestination = 3;
					break;
				case "redCountry":
					cityDestination = 4;
					break;
				case "blueberry":
					cityDestination = 5;
					break;
				case "fortZancudo":
					cityDestination = 6;
					break;
				case "ratonCanyon":
					cityDestination = 7;
					break;
				case "boneCountry":
					cityDestination = 8;
					break;
				case "palominoCreek":
					cityDestination = 9;
					break;
				default:
					System.out.println("Informe uma cidade válida!");
					break;
			}
			
			BuscaEmLargura bel = new BuscaEmLargura(cityDestination);
			bel.buscarResultado(losSantos);
			bel.exibirTextoResultado();
			
			//lasVenturas, sanFierro, montegomery, redCountry, blueberry, fortZancudo, ratonCanyon, boneCountry, palominoCreek
		}
	}
}
