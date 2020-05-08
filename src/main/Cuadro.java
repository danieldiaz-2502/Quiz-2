package main;

import processing.core.PApplet;

public class Cuadro implements Runnable {

	private PApplet app;
	private int posX;
	private int posY;
	private int tam;
	private int velY;

	public Cuadro(int posX,int posY,int tam, PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		velY = 5;
	}

	public void run() {
			
			try {
				Thread.sleep(3000);
				mover();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	
	}

	public void dibujar() {
		
		app.rect(posX,posY,tam,tam);

	}

	public void mover() {
		
		posY += velY;
		if(posY < 0) {
			velY *= -1;
		}

	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}
	

}