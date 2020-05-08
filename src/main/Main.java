package main;

import processing.core.PApplet;

public class Main extends PApplet {
	
	Cuadro figura;
	int fila;
	int columna;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}

	public void settings() {
		size(600, 400);
	}

	public void setup() {
		
	}

	public void draw() {
		  background(255, 255, 255);
		  for( fila = 0; fila < 30 ; fila++) {
	            for( columna = 0; columna < 20; columna++) {
	                figura = new Cuadro(20*fila,20*columna,20,this);
	                figura.dibujar();
	                figura.mover();
	                if(fila % 2 == 0 && columna % 2 == 0) {
	                    fill(0);
	                }
	                else {
	                    fill(255);
	                }
	                if((fila % 2!=0)& columna % 2!=0 )  {
	                    fill(0);
	                }
	            }
	        }
	}
	
	 
	public void mousePressed() {
	}
}