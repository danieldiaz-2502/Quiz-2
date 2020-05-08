package main;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet {
	
	public ArrayList<Cuadro> figuras;
	public int fila;
	public int columna;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}

	public void settings() {
		size(400, 400);
	}

	public void setup() {
		figuras = new ArrayList<Cuadro>();
		  
	}

	public void draw() {
		  background(255, 255, 255);
		  for(int i = 0; i < figuras; i++) {
			  
			    Cuadro temp = new Cuadro(this);
			    figuras.add(temp);  
			  }
		  /*for(int i = 0; i < figuras.size(); i++) {
		    
		    figuras.get(i).dibujar();
		    new Thread(figuras.get(i)).start();
		    for(int j = 0; j < figuras.size(); j++) {
			if((dist(figuras.get(i).getPosX(),figuras.get(i).getPosY(), figuras.get(j).getPosX(),figuras.get(j).getPosY()))<25){
				if (figuras.get(i).getTam()<figuras.get(j).getTam()) {
		    	figuras.get(j).setR(figuras.get(i).getR());
		    	figuras.get(j).setG(figuras.get(i).getG());
		    	figuras.get(j).setB(figuras.get(i).getB());
		    	figuras.remove(i);
		    	return;
		    } 
		  }
		    if (figuras.get(i).getTam() == figuras.get(j).getTam()) {
				if((dist(figuras.get(i).getPosX(),figuras.get(i).getPosY(), figuras.get(j).getPosX()+25,figuras.get(j).getPosY()))<25){
			    	figuras.get(j).setVelY(figuras.get(j).getVelY()*-1);
			    	figuras.get(i).setVelY(figuras.get(i).getVelY()*-1);
			    	figuras.get(j).setVelX(figuras.get(j).getVelX()*-1);
			    	figuras.get(i).setVelX(figuras.get(i).getVelX()*-1);
			    } 
			  }
		  }
		  }*/
	}
	
	 
	public void mousePressed() {
		for(int i = 0; i < fila; i++) {
		    Cuadro temp = new Cuadro(this);
		    figuras.add(temp);  
		  }
	}
}