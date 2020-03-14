package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JPanel;

import world.City;

@SuppressWarnings("serial")
public class MapView extends JPanel {


	Set<City> cities;
	
	public MapView() {
		this.setVisible(true);
		this.setBackground(Color.CYAN);
	}
	
	public void paintComponent(Graphics g) {
		

		Iterator<City> it = cities.iterator();

		if (it != null) {
			while (it.hasNext()) {
				City city = (City) it.next();
				g.setColor(Color.BLACK);
				g.fillOval(city.getX(), city.getY(), 10, 10);
			}
		}
		
		
		repaint();
		
	  }
	
	public void redraw() {
		this.repaint();
	}
	
	public void updateCities(Set<City> cities) {
		this.cities = cities;
	}

}
