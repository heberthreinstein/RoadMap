package ai;

import java.util.Iterator;
import java.util.List;

import jade.core.Agent;
import view.MainView;
import world.City;
import world.RoadMap;

public class Traveler extends Agent {
	
	protected void setup() {
		
		MainView screen = new MainView();
		
		City bucharest = new City("Bucharest",720,500);
		City pitesti = new City("Pitest",600,430);
		City rimnicu = new City("Rimnicu Vilcea",410,340);
		City sibiu = new City("Sibiu",300,250);
		City fagaras = new City("Fagaras",530,260);
	
		
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
		
		List<City> cities = map.getCityNextTo(bucharest);
		
		Iterator<City> it = cities.iterator();
		
		while (it.hasNext()) {
			City city = (City) it.next();
			System.out.println(city.getName());
		}
		
		screen.map.updateCities(map.getCities());
		
		System.out.println("Hello I'm "+ getLocalName()+" and I love traveling");
		
		
		
		
	}

}
