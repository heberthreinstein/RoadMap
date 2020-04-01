package ai;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import buscas.BuscaEmLargura;
import jade.core.Agent;
import nos.No;
import world.City;
import world.RoadMap;

public class Traveler extends Agent {
	
	protected void setup() {
		/*
		City A = new City("1");
		City B = new City("2");
		City C = new City("3");
		City D = new City("4");
		City E = new City("5");
		
		RoadMap map = new RoadMap();
		map.addCity(A);
		map.addCity(B);
		map.addCity(C);
		map.addCity(D);
		map.addCity(E);
		
		map.addRoadOneWayStreet(A, B);
		map.addRoadOneWayStreet(B, C);
		map.addRoadOneWayStreet(C, D);
		map.addRoadOneWayStreet(C, E);
		
		List<City> cities = map.getCityNextTo(C);
	
		Iterator<City> it = cities.iterator();
		
		while (it.hasNext()) {
			City city = (City) it.next();
			System.out.println(city.getName());
		}
		
		
		
		System.out.println("Hello I'm "+ getLocalName()+" and I love traveling");
		
		*/
		
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
	
		
		/*
		 * 
		No arad = new No(1);
		No zerind = new No(2);
		No arades = new No(3);
		No sibiu = new No(4);
		No timisoara = new No(5);
		No lugos = new No(6);
		No mahedia = new No(7);
		No dobreta = new No(8);
		No craiova = new No(9);
		No rimnicuVilcea = new No(10);
		No pitesti = new No(11);
		No fagaras = new No(12);
		No bulcharest = new No(13);
		No giurgio = new No(14);
		No urziceni = new No(15);
		No hirsova = new No(16);
		No eforie = new No(17);
		No vaslui = new No(18);
		No iasi = new No(19);
		No neamt = new No(20);

		 */
		
		//BuscaEmProfundidade bep = new BuscaEmProfundidade(6);	
		//bep.buscarResultado(losSantos);
		//bep.exibirTextoResultado();
		System.out.println("lasVenturas, sanFierro, montegomery, redCountry, blueberry, fortZancudo, ratonCanyon, boneCountry, palominoCreek");
		System.out.println("\nInforme o destino final: ");
		Scanner read = new Scanner(System.in);
		String city = read.next();
		
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
		
		
	}

}
