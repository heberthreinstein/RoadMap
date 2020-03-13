package ia;

import jade.core.Agent;
import world.City;
import world.RoadMap;

public class Traveler extends Agent {
	
	protected void setup() {
		City bucharest = new City("Bucharest");
		City pitesti = new City("Pitest");
		City rimnicu = new City("Rimnicu Vilcea");
		City sibiu = new City("Sibiu");
		City fagaras = new City("Fagaras");
		
		RoadMap map = new RoadMap();
		map.addCity(bucharest);
		map.addCity(pitesti);
		map.addCity(rimnicu);
		map.addCity(sibiu);
		map.addCity(fagaras);
		
		map.addRoad(bucharest, pitesti);
		map.addRoad(bucharest, fagaras);
		map.addRoad(pitesti, rimnicu);
		map.addRoad(rimnicu, sibiu);
		map.addRoad(sibiu, fagaras);
		
		
	}

}
