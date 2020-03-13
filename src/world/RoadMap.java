package world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RoadMap {
	
	private Map<City, List<City>> adjVertices;
	
	public RoadMap() {
		adjVertices = new HashMap<City, List<City>>();
	}
	
	/**
	 * Add a city on the map
	 * @param c City object
	 */
	public void addCity(City c) {
	    this.adjVertices.putIfAbsent(c, new ArrayList<City>());
	}
	
	/**
	 * Remove a city from the map
	 * @param c City object
	 */
	public void removeCity(City c) {
	    this.adjVertices.values().stream().forEach(e -> e.remove(c));
	    this.adjVertices.remove(c);
	}
	
	/**
	 * Add a two way road between two cities
	 * @param c1 City object
	 * @param c2 City object
	 */
	public void addRoad(City c1, City c2) {
	    this.adjVertices.get(c1).add(c2);
	    this.adjVertices.get(c2).add(c1);
	}
	
	/**
	 * Remove a two way road between two cities
	 * @param c1 City object
	 * @param c2 City object
	 */
	public void removeRoad(City c1, City v2) {
	    List<City> eV1 = this.adjVertices.get(c1);
	    List<City> eV2 = this.adjVertices.get(v2);
	    if (eV1 != null)
	        eV1.remove(v2);
	    if (eV2 != null)
	        eV2.remove(c1);
	}
	
	/**
	 * Get cities that has a direct road by a base city passed by parameter
	 * @param c City object of the base city  
	 * @return List of cities
	 */
	public List<City> getCityNextTo(City c) {
	    return this.adjVertices.get(c);
	}
}
