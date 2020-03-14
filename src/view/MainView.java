package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MainView extends JFrame{
	
	public MapView map = new MapView();
	
	public MainView() {
		start();
	
	}

	private void start() {
		setSize(1240, 720);
		setTitle("RoadMap AI");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.add(map);
		map.redraw();
		
	}
	
	 
		
}
